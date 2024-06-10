package String;

//take a string and print its length.

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        //.length()
        System.out.println(name.length());
        sc.close();
    }
}
