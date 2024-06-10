package Functions;

//write a function to print the Greatest Common Divisor (GDC) of 2 numbers.

import java.util.Scanner;

public class funcGCD {
    public static void GCD(int n1, int n2){
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        System.out.println("GCD is: "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GCD(n1, n2);
        sc.close();
    }
}
