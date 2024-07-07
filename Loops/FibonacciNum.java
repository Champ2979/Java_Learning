// Finding the Fibonacci number when position of the series is given.
import java.util.*;
public class FibonacciNum { // Fibonacci num is what that it adds to numbers and print sum 
    public static void main(String[] args) {
        System.out.print("Enter the position of FibonacciNum: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int previous = 0;
        int next = 1 ;

        int count = 2;

        while (count <= n) {
            int temp = next;
            next = next + previous;
            previous = temp;
            count++;           
        } 
        System.out.println("The Fibonacci num is: "+next);
    }
    
}
