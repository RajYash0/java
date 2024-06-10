package Loops.Patterns;

// print the pattern Floyd's Triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int num = 1;

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //inner loop=>columns
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
