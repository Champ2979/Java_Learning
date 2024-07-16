import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(78);
        list.add(90);
        list.add(654);
        System.out.println(list);
        System.out.println(list.contains(654));
        System.out.println(list.contains(524));
        list.set(0,99); //Setting ith index with some element
        System.out.println(list);

    }
    
}
