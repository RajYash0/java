//Check whether a number is odd or even.

import java.util.Scanner;

public class oddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        
        //condition logic
        if(x==0){
            System.out.println("Zero.");
        }else if(x%2!=0){
            System.out.println(x+" is Odd.");
        }else{
            System.out.println(x+" is Even.");
        }
        sc.close();
    }
}