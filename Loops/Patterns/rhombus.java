package Loops.Patterns;

// print the pattern Rhombus.
//     *****
//    *****
//   *****
//  *****
// *****

public class rhombus {
    public static void main(String[] args) {
        int n = 5;

        //logic: Nested loops
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}