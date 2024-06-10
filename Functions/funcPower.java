package Functions;

//write a program to input two numbers from user
//and make a function to find the value of one number raise to the power of another.
//i.e. x^n

import java.util.Scanner;

public class funcPower {
    public static int raisePower(int x, int n){
        int result = 1;
        for(int i=0;i<n;i++){
            result = result*x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter a power: ");
        int n = sc.nextInt();
        System.out.println(x+"^"+n+" = "+raisePower(x, n));
        sc.close();
    }
}
