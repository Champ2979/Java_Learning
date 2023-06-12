package conditional_statements;
import java.util.Scanner;

public class comparision {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a : ");
        
        int a = sc.nextInt();
        
        System.out.print("Enter the number b : ");
        
        int b = sc.nextInt();

        if (a==b){
            System.out.println("a and b are equal");
        } else if (a>b) {
            System.out.println("a is greater than b");
            } else {
                System.out.println("a is lesser than b");
            }


        
    }
    
}
