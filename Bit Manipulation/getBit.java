//print the bit of a number at some position.

import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the position of bit:");
        int i = sc.nextInt();
        //Bit Mask
        int bitMask = 1<<i;
        //binary AND(&)
        if((bitMask&n)==0){
            System.out.println("Bit is zero.");
        }else{
            System.out.println("Bit is one.");
        }
        sc.close();
    }
}
