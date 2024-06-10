package Loops.Patterns;

//print the pattern Inverted Half-Pyramid With Numbers
// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //inner loop=>columns
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
