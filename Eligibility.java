/*Write a program to check whether a person can vote, 
depending on whether his/her age is greater than or equal to 18.*/
import java.util.*;
public class EligibleToVote {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
    }
}

    

