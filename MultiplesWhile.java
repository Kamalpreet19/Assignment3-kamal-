//Rewrite the program to find all the multiples of a number below 100 using while loop.

import java.util.*;
public class Prog13_Level2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiples of " + num + " below 100 are:");

        int i = 1; 
        while (num * i < 100) {
            System.out.print((num * i) + " ");
            i++;  
        }
    }
}
    

