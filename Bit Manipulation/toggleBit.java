//write a program to toggle a bit at position = i in a number = n.

import java.util.Scanner;

public class toggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position:");
        int i = sc.nextInt();
        int result = toggle(n,i);
        System.out.println("Original number: "+n);
        System.out.println("Number after toggling bit at position "+i+": "+result);
        sc.close();
    }
    public static int toggle(int n, int i){
        int bitMask = 1<<i;
        return n^bitMask;
    }
}
