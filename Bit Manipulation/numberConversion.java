//write two functions=> decimalToBinary() & binaryToDecimal to convert a number from one number system to another.

import java.util.Scanner;

public class numberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 for decimal to binary conversion\nor choose 0 for binary to decimal conversion:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number in decimal form:");
                int decimalNumber = sc.nextInt();
                String binaryResult = decimalToBinary(decimalNumber);
                System.out.println("Decimal "+decimalNumber+" to binary: "+binaryResult);
                break;
            case 0:
                System.out.println("Enter the number in binary form:");
                String binaryNumber = sc.next();
                int decimalResult = binaryToDecimal(binaryNumber);
                System.out.println("Binary "+binaryNumber+" to decimal: "+decimalResult);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
    public static String decimalToBinary(int n){
        if(n==0){
            return"0";
        }
        StringBuilder binary = new StringBuilder();
        while(n>0){
            binary.append(n%2);
            n/=2;
        }
        return binary.reverse().toString();
    }
    public static int binaryToDecimal(String binary){
        int n = 0;
        int length = binary.length();
        for(int i=0;i<length;i++){
            char bit = binary.charAt(length-1-i);
            n += (bit-'0')*Math.pow(2,i); 
        }
        return n;
    }
}
