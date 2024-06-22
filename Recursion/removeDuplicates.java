package Recursion;

//remove duplicates in a string.

import java.util.Scanner;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDupe(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDupe(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar-'a'] = true;
            removeDupe(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeDupe(str, 0, "");
        sc.close();
    }
}
