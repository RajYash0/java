package Loops.Patterns;

//print the pattern Diamond.
//     *
//    ***  
//   ***** 
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

public class diamond {
    public static void main(String[] args) {
        int n = 5;

        //logic: nested loops
        //outer loop for upper area
        for(int i=1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop for lower area
        for(int i=n;i>=1;i--){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
