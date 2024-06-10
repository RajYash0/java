package Array;

//take a matrix as input from teh user.
//search for a given number x and print the indices at which it occurs.

import java.util.Scanner;

public class arrMatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix");
        int row = sc.nextInt();
        System.out.println("Enter the columns of matrix");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter elements:");
        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search:");
        int x = sc.nextInt();
        //linear search
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==x){
                    System.out.println(x+" found at location ("+i+","+j+")");
                }
            }
        }
        sc.close();
    }
}
