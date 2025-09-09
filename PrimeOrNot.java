/*Write a Program to check if the given number is a prime number or not
 */
import java.util.*;
public class Prog4_Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a prime number.");
            return;
        }

        boolean isPrime = true; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false; 
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}

