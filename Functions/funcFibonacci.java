package Functions;

//write a function to print fibonacci series of n terms.
import java.util.Scanner;

public class funcFibonacci {
    public static void fibonacci(int n){
        int a=0, b=1;
        System.out.println(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.println(b+" ");
                //logic: swapping
                int temp = b;
                b = a+b;
                a = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
