//Create a program to find the power of a number.
import java.util.*;
public class Prog12_Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);

    }
}
    

