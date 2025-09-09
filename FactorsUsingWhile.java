//Rewrite the above program 7 to find the factors of a number using the while loop
import java.util.*;
public class Prog8_Level2 {
    void findFactors(int num) {
        System.out.println("\nFactors of " + num + " are:");

        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println(" Please enter a positive integer greater than 0.");
        } else {
            Prog8_Level2 obj = new Prog8_Level2();
            obj.findFactors(num);
        }

        sc.close();
    }
}
    

