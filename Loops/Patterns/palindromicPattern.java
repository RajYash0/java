package Loops.Patterns;

//print the pattern Palindromic Pattern.
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;

public class palindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        //logic: nested loops
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for left area
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //inner loop for right area
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
