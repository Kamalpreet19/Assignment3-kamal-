//Write a program to find the sum of numbers until the user enters 0
import java.util.Scanner;
public class SumUntilZero {
    void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Enter numbers to add (enter 0 to stop):");

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The total sum is: " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        SumUntilZero obj = new SumUntilZero();
        obj.calculateSum();
    }
}


