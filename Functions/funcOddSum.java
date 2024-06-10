package Functions;

//write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class funcOddSum {
    public static void oddSum(int n){
        int sum = 0;
        //logic: Nesting
        for(int i=1;i<=n;i++){
            //check for odd
            if(i%2!=0){
                sum = sum+i;
            }
        }System.out.println("Sum= "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        oddSum(n);
        sc.close();
    }
}
