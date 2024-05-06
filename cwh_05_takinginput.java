import java.util.Scanner;
public class cwh_05_takinginput {
     public static void main(String[] args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in); // you can use anything in name of "sc"

        System.out.print("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
 
        System.out.print("Enter the number 2: ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a+b; // adding the two numbers.
        float sum = a+b; // from this you can add decimal numbers too.
        System.out.println("The resultant sum is : "+sum);

        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // String str = sc.nextLine();
        // System.out.println(str);


    
    }
}
