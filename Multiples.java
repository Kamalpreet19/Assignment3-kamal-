/* Create a program to find all the multiples of a number taken as user input below 100.*/
import java.util.*;
public class Prog11_level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiples of " + num + " below 100 are:");

        for (int i = 1; i * num < 100; i++) {
            System.out.print((num * i) + " ");
        }
    }
}


