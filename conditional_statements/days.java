// This will print the number of days according to the input provided by the user.
// These are made with the help of switch statements.

package conditional_statements;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {

        System.out.println("Enter numbers between 1 to 7");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1 : System.out.println("Monday");
            break;

            case 2 : System.out.println("Tuesday");
            break;

            case 3 : System.out.println("Wednusday");
            break;

            case 4 : System.out.println("Thrusday");
            break;

            case 5 : System.out.println("Friday");
            break;

            case 6 : System.out.println("Saturday");
            break;

            case 7 : System.out.println("Sunday");
            break;

            default : System.out.println("Invalid Input");
            break;

        }

    }
    
}
