package Array;

//print the spiral order matrix as output for a matrix of numbers.

import java.util.Scanner;

public class arrMatSpiralOrder {
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
        //spiral order
        System.out.println("The spiral order matrix is:");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        //condition logic
        while(rowStart<=rowEnd&&colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(mat[rowStart][col]+" ");
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(mat[row][colEnd]+" ");
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(mat[rowEnd][col]+" ");
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(mat[row][colStart]+" ");
            }
            colStart++;
            System.out.println();
        }
        sc.close();
    }
}
