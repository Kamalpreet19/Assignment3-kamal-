//Create a program to find the bonuses of employees based on their years of service.
import java.util.*;
public class Prog2_Level2{
    static void calculateBonus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        int bonus = 0;
        if (years > 10) {
            bonus = 10000;
        } else if (years >= 6) {
            bonus = 5000;
        } else if (years >= 3) {
            bonus = 2000;
        } else {
            bonus = 0;
        }
        System.out.println("Bonus for " + years + " years of service is: " + bonus);

        scanner.close();
    }

    public static void main(String[] args) {
        calculateBonus();
    }
}

