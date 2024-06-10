package Array;

//find the maximum and minimum number in an array of integer.

import java.util.Scanner;

public class arrMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //arr.length=size of array
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number is: "+max+"\n"+"Smallest number is: "+min);
        sc.close();
    }
}
