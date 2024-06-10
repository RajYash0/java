package Loops.Patterns;

//print the pattern Half-Pyramid With Numbers
// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;

public class halfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //inner loop=>columns
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
