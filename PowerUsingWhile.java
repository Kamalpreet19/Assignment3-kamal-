//Rewrite the above program to find the power of a number using a while loop.
import java.util.*;
public class Prog14_Level2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = 1;   
        int i = 1;        

        
        while (i <= exponent) {
            result *= base;
            i++;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);

    }
}
    

