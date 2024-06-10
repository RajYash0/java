package Loops;

//Check whether a number is prime or not.

import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println(n+" is neither prime nor composit.");
            }else{
                System.out.println(n+" is a prime number.");
            }
        }else{
            System.out.println(n+" is not a prime number.");
        }
        sc.close();
    }
}
