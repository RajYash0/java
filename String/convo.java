package String;

//ask user about themselves and use the information to create a sentence.

import java.util.Scanner;

public class convo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input 
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What do you do?");
        String job = sc.nextLine();
        System.out.println("Where are you from?");
        String add = sc.nextLine();
        System.out.println("How old are you");
        int age = sc.nextInt();

        //output
        System.out.print("so "+name+", you're a "+age+" year old "+job+" from "+add+"?\nIntresting!");
        sc.close();
    }
}
