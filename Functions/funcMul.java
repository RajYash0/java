package Functions;

//write a function to multiply two numbers.

import java.util.Scanner;

public class funcMul {
    public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Product of "+a+" and "+b+" is: "+mul(a, b));
        sc.close();
    }
}
