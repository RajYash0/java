//Take two numbers 'a' and 'b' and print their sum.

import java.util.Scanner;

public class addTwoNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Emter Second Number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        sc.close();
    }
}