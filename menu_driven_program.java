/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s
marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Excellent”
89 >= Marks >= 60 -> print “This is Good”
59 >= Marks >= 0 -> print “This is Bad”
Because marks don’t matter but our effort does. */ 
package Loops.homework_problems;
 import java.util.Scanner;
public class menu_driven_program {
    public static void main(String[] args) {

            int choice = 0;
            Scanner sc = new Scanner(System.in);
            int marks;

            System.out.println("Press 1 to enter marks");
            System.out.println("Press 0 to exit");
            choice = sc.nextInt();

            if(choice ==0){
                System.out.println("Exiting");
            }

            while ( choice !=0){
                System.out.print("Enter your marks: ");
                marks = sc.nextInt(); 
                if(marks>100 || marks<0){
                    System.out.println("Invalid Input!!!"); 
                }
                else if ( marks >= 90){
                    System.out.println("This is Excellent");
                } 
                else  if ( marks>= 60 && marks<=89 ){
                    System.out.println("This is Good"); 

                } 
                else{System.out.println("This is Bad");}

                

                System.out.println("Press 1 to enter marks");
                System.out.println("Press 0 to exit");
                choice = sc.nextInt();
                    
                 if(choice ==0){
                System.out.println("Exiting");
                sc.close();
            }

        }


    }

}
            

            



          
