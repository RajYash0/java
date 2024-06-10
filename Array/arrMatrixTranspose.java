package Array;

//for a matrix of N*M, print its transpose.

import java.util.Scanner;

public class arrMatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix");
        int n = sc.nextInt();
        System.out.println("Enter the columns of matrix");
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        System.out.println("Enter elements:");
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //transpose
        System.out.println("The transpose is:");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
