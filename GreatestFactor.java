/*Create a program to print the greatest factor of a number beside itself using a loop. */
import java.util.*;
public class Prog9_Level2 {
    void findGreatestFactor(int num) {
        System.out.println("\nFinding the greatest factor of " + num + " (excluding itself)...");

        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println("The greatest factor of " + num + " (excluding itself) is: " + i);
                return; 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            Prog9_Level2 obj = new Prog9_Level2();
            obj.findGreatestFactor(num);
        }

        sc.close();
    }
}

