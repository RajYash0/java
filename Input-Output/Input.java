//How to take input from user

import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//single world

        // nextLine()=>Input a Line.
        // nextInt()=>Input an Integer.
        // nextFloat()=>Input Decimals.

        System.out.println(name);
        sc.close();
    }
}