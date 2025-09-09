/*Write a program FizzBuzz, take a number as user input, and check for a positive 
integer. If positive integer, loop and print the number, but for multiples of 3 
print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for
 multiples of both print "FizzBuzz". */

 import java.util.*;
public class Prog4_Level2 {
     void printFizzBuzz(int n) {
        System.out.println("\n=== FizzBuzz from 1 to " + n + " ===");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        Prog4_Level2 obj = new Prog4_Level2();
        obj.printFizzBuzz(n);

        sc.close();
    }
}
    

