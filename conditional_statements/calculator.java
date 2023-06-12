package conditional_statements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter the operation: ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for +Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Remainder");

        int operation = sc.nextInt();
        int result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Addition Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Subtraction Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Multiplication Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                result = a % b;
                System.out.println("Remainder Result: " + result);
                break;
            default: 
            System.out.println("The operation is invalid");
        }
    }
}
