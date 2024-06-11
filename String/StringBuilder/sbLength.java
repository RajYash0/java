//find the length of the string.

import java.util.Scanner;

public class sbLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        //.lenght()
        System.out.println("The lenght of string is: "+sb.length());
        sc.close();
    }
}
