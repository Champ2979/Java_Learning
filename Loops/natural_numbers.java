// Addition of n natural numbers provided by user.
package Loops;
 
import java.util.*;

public class natural_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the number n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for( int i=0; i<n; i++){
            sum = sum + i;
        }
         System.out.println("The sum of given number n is "+sum);
         
    }
} 
