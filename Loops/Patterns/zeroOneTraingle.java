package Loops.Patterns;

// print the pattern 0-1 Triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.Scanner;

public class zeroOneTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: Nested loops

        //outer loop=>rows
        for(int i=1;i<=n;i++){
            //inner loop=>columns
            for(int j=1;j<=i;j++){
                //condition logic
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
