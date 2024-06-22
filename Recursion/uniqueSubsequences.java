package Recursion;

import java.util.HashSet;

//print all the unique subsequences of a string.

import java.util.Scanner;

public class uniqueSubsequences {
    public static void subSeqences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        subSeqences(str, idx+1, newString+currChar, set);
        //or not to be
        subSeqences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<String> set = new HashSet<>();
        subSeqences(str, 0, "", set);
        sc.close();
    }
}
