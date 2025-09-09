//Write a program to check if a number is divisible by 5
import java.util.*;
public class Prog1_Level1{
    Scanner sc=new Scanner(System.in);

    void divisible(){
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        if(num%5==0){
            System.out.println("Number is divisible by 5:" );
        }
        else{
            System.out.println("Number is not divisible by 5" );
        }
    }
    public static void main(String args[]){
        Prog1_Level1 obj=new Prog1_Level1();
        obj.divisible();
    }
}