package String;

//take a string and replace all the 'e' in the string with 'i'.

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        String result = "";//empty string declaration
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result += 'i';//result = result + 'i';
            }else{
                result += str.charAt(i);//result = result + str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
