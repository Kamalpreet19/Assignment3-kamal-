//Create a program to print odd and even numbers between 1 to the number entered by the user.
import java.util.*;
public class Prog1_Level2 {
    void printEvenNumbers(int num) {
        System.out.println("\nEven numbers between 1 and " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void printOddNumbers(int num) {
        System.out.println("\nOdd numbers between 1 and " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println(" Please enter a positive number greater than 0.");
            sc.close();
            return;
        }

        Prog1_Level2 obj = new Prog1_Level2();
        obj.printEvenNumbers(num);
        obj.printOddNumbers(num);

        sc.close();
    }
}

    

