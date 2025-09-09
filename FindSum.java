/*Rewrite the program 10 to find the sum until the user enters 0 or a negative 
number using while loop and break statement */
import java.util.*;
public class SumUntilZeroOrNegative {
      static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num <= 0) {  
                break;
            }
            sum += num;
        }
        System.out.println("Sum of entered positive numbers is: " + sum);
        
    }
    public static void main(String[] args) {
        sumNumbers();
    }
}
    
