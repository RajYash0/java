//write a program to count the number of ones in a binary representation of the number.

import java.util.Scanner;

public class countOnesInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = countOnes(n);
        System.out.println("The number of 1's in the binary representation of "+n+" is: "+count);
        sc.close();
    }
    public static int countOnes(int n){
        int count = 0;
        while(n!=0){
            count += n&1;
            n>>=1;
        }
        return count;
    }
}
