// Question : If user gives 1- print Hello, if user gives 2- print Namaste,
            // if user gives 3- print bonjor, for other input - print Invalid input.

package conditional_statements;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 or 2 or 3 as per your choice");

        int button = sc.nextInt();

        //if (button==1) {
        //    System.out.println("Hello");
        //} else if (button==2) {
         //   System.out.println("Namaste");}
       // else if (button==3){
       //     System.out.println("bonjour"); }
      //  else {
      //      System.out.println("Invalid input");

        switch (button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;

            default : System.out.println("Invalid Input");


        }   
    }

}

