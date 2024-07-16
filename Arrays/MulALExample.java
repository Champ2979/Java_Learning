import java.util.*;
public class MulALExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.print("Enter the ArrayList: ");
        Scanner s = new Scanner(System.in);
        // Arraylist initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // add elements
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                list.get(i).add(s.nextInt());
            }    
        }
        System.out.println(list);
    }
    
}
