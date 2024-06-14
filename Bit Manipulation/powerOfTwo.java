//write a program to find if a number is a power of 2 or not.

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean result = isPowerOfTwo(n);
        if(result){
            System.out.println(n+" is a power of two.");
        }else{
            System.out.println(n+" is not a power of two.");
        }
        sc.close();
    }
    public static boolean isPowerOfTwo(int n){
        if(n<0){
            return false;
        }
        return(n&(n-1))==0;
    }
}
