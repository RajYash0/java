//Take input in string builder and print it.

import java.util.Scanner;

public class sbInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter your text:");
        String input = sc.nextLine();
        sb.append(input);
        System.out.println("\nYour entered:");
        System.out.println(sb);
        sc.close();
    }
}
