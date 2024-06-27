package Recursion;

//print all the subsets of a set of first n natural numbers.

import java.util.ArrayList;
import java.util.Scanner;

public class subset {
    public static void findsubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // wil add
        subset.add(n);
        findsubsets(n - 1, subset);
        // won't add
        subset.remove(subset.size() - 1);
        findsubsets(n - 1, subset);
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findsubsets(n, subset);
        sc.close();
    }
}
