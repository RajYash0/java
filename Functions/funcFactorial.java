package Functions;

//write a function to print the factorial of a number.

import java.util.Scanner;

public class funcFactorial {
    public static void printFactorial(int n){
        //condition fo negative numbers
        if(n<0){
            System.out.println("Invalid Number!");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(n+"! = "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printFactorial(n);
        sc.close();
    }
}
