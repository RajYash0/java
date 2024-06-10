package Loops.Patterns;

// print the pattern Number Pyramid.
//     1 
//    2 2 
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: nested loops
        //outer loop
        for(int i=1;i<=n;i++){
            //first inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //second inner loop for numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
