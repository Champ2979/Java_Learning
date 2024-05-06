import java.util.Scanner;
public class SumOFThreeNumbers{
     public static void main(String[] args){
    /* Write a program to sum three numbers in java.*/
    System.out.println("Taking the input from the user:-");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number 1: ");
    float a = sc.nextFloat();

    System.out.print("Enter the number 2: ");
    float b = sc.nextFloat();

    System.out.print("Enter the number 3: ");
    float c = sc.nextFloat();

    float sum = a+b+c;

    System.out.println("The resultant sum is: "+sum);
    







    }
}