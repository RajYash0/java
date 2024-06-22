package Recursion;

//print sum of first n natural numbers.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int n = sc.nextInt();
        printSum(i,n,sum);
        sc.close();
    }
    public static void printSum(int i, int n, int sum){
        //base case
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        //recursion
        printSum(i+1, n, sum);
    }
}
