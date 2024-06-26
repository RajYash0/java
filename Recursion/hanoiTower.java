package Recursion;

//tower of Hanoi.

import java.util.Scanner;

public class hanoiTower {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        //base case
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,"S","H","D");
        sc.close();
    }
}
