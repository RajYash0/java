package Loops.Patterns;

//print the pattern Inverted Half-Pyramid
// ****
// ***
// **
// *

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=n;i>=1;i--){
            //inner loop=>columns
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
