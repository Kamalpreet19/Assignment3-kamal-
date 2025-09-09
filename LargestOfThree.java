//Write a program to check if the first, second, or third number is the largest of the three.
import java.util.*;
public class Largest_of_three {
    Scanner sc=new Scanner(System.in);

    void check(){
        System.out.print("Enter first number:");
        int num1=sc.nextInt();

        System.out.print("Enter second number:");
        int num2=sc.nextInt();

        System.out.print("Enter third number:");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("First number is the largest");
        }
        else if(num2 >num1 && num2>num3){
            System.out.println("Second number is the largest");
        }
        else{
            System.out.println("Third number is the largest");
        }
    }
    public static void main(String args[]){
        Largest_of_three obj=new Largest_of_three();
        obj.check();
    }
    
}
