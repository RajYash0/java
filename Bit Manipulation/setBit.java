//change the bit to one of a number at some position.

import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int i = sc.nextInt();
        //Bit Mask
        int bitMask = 1<<i;
        //binary OR(|)
        int newNumber = bitMask|n;
        System.out.println("Your new number after changing the bit at position "+i+" is: "+newNumber);
        sc.close();
    }
}
