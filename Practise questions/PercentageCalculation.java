import java.util.Scanner;
public class PercentageCalculation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for subject 1(out of 100): ");
        float a = sc.nextInt();

        System.out.print("Enter the marks for subject 2(out of 100): ");
        float b = sc.nextInt();

        System.out.print("Enter the marks for subject 3(out of 100): ");
        float c = sc.nextInt();

        System.out.print("Enter the marks for subject 4(out of 100): ");
        float d = sc.nextInt();

        System.out.print("Enter the marks for subject 5(out of 100): ");
        float e = sc.nextInt();

        float result = ((a+b+c+d+e)/500) *100;

        System.out.println("Overall percentage is: " + result + "%");
        
    }
    
}
