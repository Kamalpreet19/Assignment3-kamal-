/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony 
based on their ages and the tallest among the friends based on their heights
 */

 import java.util.*;
public class Prog6_Level2 {
    void findYoungest(int ageAmar, int ageAkbar, int ageAnthony) {
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("The youngest friend is Amar with age " + ageAmar + " years.");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("The youngest friend is Akbar with age " + ageAkbar + " years.");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("The youngest friend is Anthony with age " + ageAnthony + " years.");
        } else {
            System.out.println("Two or more friends have the same youngest age.");
        }
    }

    void findTallest(double heightAmar, double heightAkbar, double heightAnthony) {
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("The tallest friend is Amar with height " + heightAmar + " cm.");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("The tallest friend is Akbar with height " + heightAkbar + " cm.");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("The tallest friend is Anthony with height " + heightAnthony + " cm.");
        } else {
            System.out.println("Two or more friends have the same tallest height.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        Prog6_Level2 obj = new Prog6_Level2();

        System.out.println("\n=== Results ===");
        obj.findYoungest(ageAmar, ageAkbar, ageAnthony);
        obj.findTallest(heightAmar, heightAkbar, heightAnthony);

        sc.close();
    }
}
    

