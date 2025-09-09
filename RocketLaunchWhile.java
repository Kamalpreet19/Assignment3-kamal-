/*Write a program to count down the number from the user input value to 
1 using a while loop for a rocket launch*/

import java.util.Scanner;
public class CountNumber {
    void startCountdown(int counter) {
        System.out.println(" Starting countdown..");

        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }
        System.out.println("Liftoff! Rocket Launched!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
        CountNumber obj = new CountNumber();
        obj.startCountdown(counter);

    }
}


