//delete a character at some Index.

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

        //.setCharAt()
        //deletes a character
        sb.delete(i, j);
        System.out.println(sb);
        sc.close();
    }
}
