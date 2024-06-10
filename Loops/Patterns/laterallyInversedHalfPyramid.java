package Loops.Patterns;

//print the pattern Laterally Inversed Half-Pyramid
//    *
//   **
//  ***
// ****

import java.util.Scanner;

public class laterallyInversedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //first inner loop=>column spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //second inner loop=>column stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
