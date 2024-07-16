import java.util.*;

public class LoopsusingArrays {
    public static void main(String[] args) {
        System.out.print("Enter the names in the form of an array: ");
        String[] str = new String[5];
        Scanner s = new Scanner(System.in);
        // input using for loops
        for(int i =0; i<str.length; i++){
            str[i] = s.next();
        }
        System.out.println(Arrays.toString(str));

        /*System.out.print("Enter the number arrays: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr)); */
        s.close();
    }
}
