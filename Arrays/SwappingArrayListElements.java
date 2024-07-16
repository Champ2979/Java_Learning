import java.util.*;

public class SwappingArrayListElements {
    // Swaps elements in an ArrayList
    static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the array elements:");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());    
        }
        // Swapping the first and last elements
        swap(list, 0, 4);
        System.out.println("List after swapping: " + list);
        s.close();
    }
}
