package Recursion;

//print factorial of a number n.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = printFactorial(n);
        System.out.println(ans);
        sc.close();
    }
    public static int printFactorial(int n){
        //base case
        if(n==1||n==0){
        return 1;
        }
        //recursion
        int fact_nm1 = printFactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
}
