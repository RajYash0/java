package Loops.Patterns;

//print the pattern Solid-Retangle
// *****
// *****
// *****
// *****

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //inner loop=>columns
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
