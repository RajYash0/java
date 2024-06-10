package String;

//take two strings and compare them.

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        //s1>s2: +ve Value
        //s1==s2: 0
        //s1<s2: -ve Value

        //firstString.compareTo(secondString)
        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are unequal.");
        }
        sc.close();
    }
}
//in the if-else statement the operation "==" is not used independently because,
//the output of the operation without ".compareTo()" function maybe wrong in some cases.