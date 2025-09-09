/*Create a program to check if a number is armstrong or not.
 Use the hints to show the steps clearly in the code */

import java.util.*;
public class Prog5_Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;         
            sum += digit * digit * digit; 
            num /= 10;                  
        }

        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
