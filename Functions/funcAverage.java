package Functions;

//write a function to print the average of therr numbers taken from user.

import java.util.Scanner;

public class funcAverage {
    public static void average(int a, int b, int c){
        System.out.println("Average = "+(a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a, b, c);
        sc.close();
    }
    
}
