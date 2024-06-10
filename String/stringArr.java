package String;

//take an array of strings and find the cumulative(combined) length of all those strings.

import java.util.Scanner;

public class stringArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
        //input array of strings
        for(int i = 0;i<size;i++){
            array[i] = sc.next();
        }
        //calculation
        for(int i = 0;i<size;i++){
            totLength += array[i].length();//totLength = totLength+array[i].length();
        }
        //output
        System.out.println(totLength);
        sc.close();
    }
}
