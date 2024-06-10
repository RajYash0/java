package Functions;

//write a function to print the sum of two numbers.

import java.util.Scanner;

public class funcAdd {
    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        sum(a, b);
        sc.close();
    }
}
