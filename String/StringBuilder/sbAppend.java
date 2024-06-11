//add a character at the end of string.(Append)

import java.util.Scanner;

public class sbAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("Enter the character to add at the end:");
        String str = sc.next();

        //.appned(string);
        sb.append(str);
        System.out.println(sb);
        sc.close();
    }
}
