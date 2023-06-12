package conditional_statements;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class If_Else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();

        if(age>=18) {
        System.out.println("The person is eligible for voting.");
     }

        else {
            System.out.println("The person is not eligible for voting");
        }

        


    }
    
}
