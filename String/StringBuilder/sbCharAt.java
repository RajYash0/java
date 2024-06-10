//get a character from a Index.

import java.util.Scanner;

public class sbCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("Enter the index of character:");
        int i = sc.nextInt();

        //.charAt(index)
        System.out.println(sb.charAt(i));
        sc.close();
    }
}
