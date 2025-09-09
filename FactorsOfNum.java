/*Create a program to find the factors of a number taken as user input. */

import java.util.*;
public class FactorsOfNum {
    void findFactors(int num) {
        System.out.println("\nFactors of " + num + " are:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            FactorsOfNum obj = new FactorsOfNum();
            obj.findFactors(num);
        }

        sc.close();
    }
}

    

