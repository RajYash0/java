//replace a character at a Index.

import java.util.Scanner;

public class sbSetCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("Enter the character:");
        String str = sc.next();
        char c = str.charAt(0);
        System.out.println("Enter the index at you want to insert character:");
        int i = sc.nextInt();

        //.setCharAt(index, character);
        //replaces a character
        sb.setCharAt(i, c);
        System.out.println(sb);
        sc.close();
    }
}
