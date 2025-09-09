//Create a program to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;
public class MultiplicationTable {
     static void printTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        printTable();
    }
}

