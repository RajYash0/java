package Recursion;

//count total paths in a maze to move from (0,0) to (n,m).

// rules:
// can only move right or down

import java.util.Scanner;

public class maze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);
        // move right
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
        sc.close();
    }
}
