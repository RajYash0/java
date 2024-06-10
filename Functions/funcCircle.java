package Functions;

//write a function that takes in teh radius as input and returns teh circumference of a circle.

import java.util.Scanner;

public class funcCircle {
    public static float circumference(float r){
        return 2*(float)Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle(in cm): ");
        float r = sc.nextFloat();
        System.out.println("The circumference of circle of radius "+r+" is "+circumference(r)+"cm.");
        sc.close();
    }
}
