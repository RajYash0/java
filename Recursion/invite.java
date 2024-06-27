package Recursion;

//find the number of ways in which you can invie n people to your party, single or in pairs.

import java.util.Scanner;

public class invite {
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = callGuests(n - 1);
        // pair
        int ways2 = (n - 2) * callGuests(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(callGuests(n));
        sc.close();
    }
}
