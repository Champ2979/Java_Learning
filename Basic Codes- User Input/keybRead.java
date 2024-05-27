// reading from the keyboard - Abdul Bari Java classes.
import java.util.Scanner;

 class keybRead{
    public static void main(String[] args){

        int a;
        int b;
        int c; 

        System.out.print("Enter the number a:");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();

        System.out.print("Enter the number b:");
         b = sc.nextInt();

         c = a+b;
        System.out.println("The sum of a and b is "+c);
        sc.close();
    }
}