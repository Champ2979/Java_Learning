import java.util.*;
// online compiler
class AddThreeNumbers {
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number a: ");
         int a = s.nextInt();

         System.out.print("Enter the number b: ");
         int b = s.nextInt();

         System.out.print("Enter the number c: ");
         int c = s.nextInt();

         int ans = (a+b+c);

         System.out.println("The sum of the three numbers are: "+ans);

         s.close();
        
    }
}