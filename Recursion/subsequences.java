package Recursion;

//print all the subsequences of a string.

import java.util.Scanner;

public class subsequences {
    public static void subSeqences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSeqences(str, idx+1, newString+currChar);
        //or not to be
        subSeqences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        subSeqences(str, 0, "");
        sc.close();
    }
}
