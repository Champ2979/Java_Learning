import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
       /*  System.out.print("Hello User! Please enter the input: ");
        for(int i=0; i<3; i++){
            list.add(s.nextInt());
        }
        System.out.println(list);*/
        // get item from any index
        System.out.print("Hello Again. Please enter another array: ");
        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());            
        }
        System.out.println("Hence the 2nd index is: "+list.get(2));
        s.close();
    }

    
}
