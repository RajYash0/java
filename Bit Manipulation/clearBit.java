//change the bit to zero of a number at some position.

import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int i = sc.nextInt();
        //Bit Mask
        int bitMask = 1<<i;
        //binary AND(&) with binary NOT(~) of bitMask
        int notBitMask = ~bitMask;
        int newNumber = notBitMask&n;
        System.out.println("The new number after deleting the bit at position "+i+" is: "+newNumber);
        sc.close();
    }
}
