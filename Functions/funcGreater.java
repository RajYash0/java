package Functions;

//write a function that takes in two numbers and returns the greater of those two numbers.
import java.util.Scanner;

public class funcGreater {
    public static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Between "+a+" and "+b+", "+greaterNumber(a, b)+" is greater.");
        sc.close();
    }
}
