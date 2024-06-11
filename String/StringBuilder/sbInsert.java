//insert a character at a Index of a string.

import java.util.Scanner;

public class sbInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("Enter the character:");
        String str = sc.next();
        char c = str.charAt(0);
        System.out.println("Enter the index at you want to insert character:");
        int i = sc.nextInt();

        //.insert(index, character);
        //inserts a character
        sb.insert(i, c);
        System.out.println(sb);
        sc.close();
    }
}
