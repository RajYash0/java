package Array;

//Take input of array and print it.

import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        //declaration:
        //type[] arrayName = new type[size];
        //type arrayName[] = new type[size];
        //direct initialization:
        //type[] arrayName = {element1,element2,element3,...};
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements:");
        //input
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Your Array is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
