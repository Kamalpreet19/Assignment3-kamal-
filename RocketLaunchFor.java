//Rewrite program 8 to do the countdown using the for-loop
import java.util.Scanner;
public class forLoop {

    void startCountdown(int counter) {
        System.out.println("Starting countdown...");

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Liftoff! Rocket Launched!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        forLoop obj = new forLoop();
        obj.startCountdown(counter);

    }
}


