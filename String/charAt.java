package String;

//take a string and print its each character separately.

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        //.charAt(index)
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
    
}
