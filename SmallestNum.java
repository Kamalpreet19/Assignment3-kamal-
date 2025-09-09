//Write a program to check if the first is the smallest of the 3 numbers.
import java.util.*;
public class Smallest_of_three {
    Scanner sc=new Scanner(System.in);

    void input(){
        System.out.print("Enter first number:");
        int num1=sc.nextInt();

        System.out.print("Enter second number:");
        int num2=sc.nextInt();

        System.out.print("Enter third number:");
        int num3=sc.nextInt();

        if(num1<num2&&num1<num3){
            System.out.println("First number is the smallest");
        }
        else{
            System.out.println("First number is not the smallest");
        }
    }
    public static void main(String args[]){
        Smallest_of_three obj=new Smallest_of_three();
        obj.input();
    }
    
}
