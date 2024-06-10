package Array;

//take input of matrix and print it.
import java.util.Scanner;

public class arrMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix");
        int row = sc.nextInt();
        System.out.println("Enter the columns of matrix");
        int col = sc.nextInt();
        //a matrix is a two dimensional array.

        //declaration:
        //type[][] matrixName = new type[rows][columns];
        //type matrixName[][] = new type[rows][columns];
        //direct initialization:
        //type[][] matrixName = {{element1,element2,element3,...},{element4,element5,element6,...};
        int mat[][] = new int[row][col];
        System.out.println("Enter elements:");
        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
