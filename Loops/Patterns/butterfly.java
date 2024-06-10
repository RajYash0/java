package Loops.Patterns;

// print the pattern butterfly. 
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        
        //upper half

        for(int i=1;i<=n;i++){
            //left area
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //right area
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half

        for(int i=n;i>=1;i--){
            //left area
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //right area
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
