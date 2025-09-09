/*Rewrite the program number 12 with 
the for loop instead of a while loop to find the sum of n Natural Numbers. */

import java.util.Scanner;

public class Prog13_level1 {

    int sumUsingFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    void compareResults(int n) {
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        int sumFor = sumUsingFor(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using for-loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumFor == sumFormula) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There is a mismatch in computations!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        Prog13_level1 obj = new Prog13_level1();
        obj.compareResults(n);

    }
}
 