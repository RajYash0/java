package Recursion;

//move all the 'x' to the end of the string.

import java.util.Scanner;

public class move {
    public static void moveAllX(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }else{
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        moveAllX(str, 0, 0, "");
        sc.close();
    }
}
