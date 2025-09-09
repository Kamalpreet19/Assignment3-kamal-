//Write a Program to find the factorial of an integer entered by the user.
import java.util.*;
public class factorial {
     static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        calculateFactorial();
    }
}
    

