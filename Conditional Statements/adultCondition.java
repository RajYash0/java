//Check whether a person is adult or not.

import java.util.Scanner;

public class adultCondition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        //condition logic
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
        sc.close();
    }
}