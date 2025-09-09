//Write a program to check for the natural number and write the sum of n natural numbers
import java.util.*;
public class Sum_of_naturalNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " is a natural number.");
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println(n + " is NOT a natural number. Natural numbers start from 1.");
        }
    }
}

