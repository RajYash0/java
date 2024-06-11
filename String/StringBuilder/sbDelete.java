//delete a character at some Index of string.

import java.util.Scanner;

public class sbDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("Enter the starting index:");
        int i = sc.nextInt();
        System.out.println("Enter the ending index:");
        int j = sc.nextInt();

        //deletes a character from i to j-1(j is excluded)
        sb.delete(i, j);
        System.out.println(sb);
        sc.close();
    }
}
