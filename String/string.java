package String;

//Take input of string and print it.

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //direct initialization
        //String varName = "xyz";
        
        //input 
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        //output
        System.out.println("Your name is: "+name);
        sc.close();
    }
}
//NOTE: Strings are Immutable.