package Recursion;

//print numbers from 1 to 5.

public class print {
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
    public static void printNum(int n){
        //base case
        if(n==6)
        return;
        System.out.println(n);
        //recursion
        printNum(n+1);
    }
}
