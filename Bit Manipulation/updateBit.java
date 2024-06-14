//change the bit of a number at some position to one or zero as per users wish.

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        System.out.println("Enter 1 to change the bit to one\nor 0 to change the bit to zero:");
        int oper = sc.nextInt();
        if(oper==1){
            //set bit operation

            //binary OR(|)
            int newNumber = bitMask|n;
            System.out.println("Your new number after changing the bit at position "+i+" is: "+newNumber);
        }else if(oper==0){
            //clear bit operation

            //binary AND(&) with binary NOT(~) of bitMask
            int notBitMask = ~bitMask;
            int newNumber = notBitMask&n;
            System.out.println("The new number after deleting the bit at position "+i+" is: "+newNumber);
        }else{
            System.out.println("Invalid Choice:");
        }
        sc.close();
    }
}
