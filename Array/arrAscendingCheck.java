package Array;

//check if the array is in ascending order.

import java.util.Scanner;

public class arrAscendingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<arr.length;i++){
            //condition logic
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is not sorted in ascending order.");
        }
        sc.close();
    }
}
