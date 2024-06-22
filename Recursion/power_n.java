package Recursion;

//print x^n (stack height = n)

import java.util.Scanner;

public class power_n {
    public static int calcPower(int x,int n){
        //base case
        if(n==0){
        return 1;
        }
        if(x==0){
        return 0;
        }
        //recursion
        int xPownm1 = calcPower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = calcPower(x, n);
        System.out.println(ans);
        sc.close();
    }
}
