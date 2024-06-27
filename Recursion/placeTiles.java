package Recursion;

//count ways to place tiles of size 1*m in a floor of size n*m.

import java.util.Scanner;

public class placeTiles {
    public static int tiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int verPlacements = tiles(n - m, m);
        // horizontally
        int horPlacements = tiles(n - 1, m);
        return verPlacements + horPlacements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(tiles(n, m));
        sc.close();
    }
}
