// Print the tables of the number n.
package Loops;
import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        System.out.print("Enter the number n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n*i); 
        }
        
    }
    
}
