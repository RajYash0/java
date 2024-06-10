package String;

//take an E-mail ID from the user to create a username from the E-mail
//by deleting the part that comes after '@'.
//display that username to the user.

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the E-mail ID:");
        String email = sc.next();
        String userName = "";//empty string declaration

        for(int i=0;i<email.length();i++){
            //condition
            if(email.charAt(i)=='@'){
                break;
            }else{
                userName += email.charAt(i);//userName = userName + email.charAt(i);
            }
        }
        System.out.println(userName);
        sc.close();
    }
}
