/*Write a LeapYear program that takes a year as input and outputs the Year
 is a Leap Year or not a Leap Year. */

import java.util.*;
public class Prog1_Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            if (year % 100 == 0) {
                System.out.println(year + " is Not a Leap Year");
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            }
        }

    }
}
    

