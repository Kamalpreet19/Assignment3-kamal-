//Create a program to print odd and even numbers between 1 to the number entered by the user

import java.util.Scanner;
public class OddEven {
    static void printOddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Even numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOdd numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }

    public static void main(String[] args) {
        printOddEven();
    }
}
    

