package Recursion;

//print the fibonacci sequence till nth term.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = sc.nextInt();
        printFib(a,b,n-2);
        sc.close();
    }
    public static void printFib(int a,int b,int n){
        //base case
        if(n==0)
        return;
        int c = a+b;
        System.out.print(c+" ");
        //recursion
        printFib(b, c, n-1);
    }
}
