/*Write a program to find the sum of n natural numbers using while loop compare the result with
 the formulae n*(n+1)/2 and show the result from both computations was correct. */
import java.util.Scanner;
public class Prog12_level1 {
    
    int sumUsingWhile(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
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

        int sumWhile = sumUsingWhile(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There is a mismatch in computations!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        Prog12_level1 obj = new Prog12_level1();
        obj.compareResults(n);
    }
}

