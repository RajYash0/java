package Array;

//take an array as input from the user.
//search for a give n number x and print the index at which it occurs.

import java.util.Scanner;

public class arrSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search:");
        int x = sc.nextInt();
        //linear search
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println(x+" is found at index: "+i);
            }
        }
        sc.close();
    }
}
