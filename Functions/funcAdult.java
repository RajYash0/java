package Functions;

//write a function that takes in teh age as input 
//and returns if that person is eligible to vote or not (i.e. 18+).

import java.util.Scanner;

public class funcAdult {
    public static boolean adult(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(adult(age)){
            System.out.println("Eligible to vote.");
        }else{
            System.out.println("Not-Eligile to vote.");
        }
        sc.close();
    }
}
