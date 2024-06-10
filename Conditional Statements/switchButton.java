//Write a program to take number from 1-7 from user and output a day.

import java.util.Scanner;

public class switchButton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number from 1-7: ");
        int button = sc.nextInt();

        //Switch-case conditional statement
        switch (button){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thursday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
            default: System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
