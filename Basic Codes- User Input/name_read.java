import java.util.Scanner;
public class name_read{

    public static void main(String[] args) {
        System.out.println("May I know your name?");
        String name;
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.println("Your name is "+name);
        s.close(); 
    }
    
}
