import java.util.*;
public class SwappingArrayElements {
    
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        System.out.print("Enter the array elements: ");
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        swap(arr, 2,4);
        System.out.println("After Swapping: "+Arrays.toString(arr));
    }
    
}
