//Create a program to check if a number taken from the user is a Harshad Number.

import java.util.Scanner;
public class HarshadNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10; 
            sumOfDigits += digit;
            number = number / 10;     
        }

        
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        sc.close();
    }
}

