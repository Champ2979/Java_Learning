import java.util.*;
public class MatrixArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // for taking the input
        System.out.println("Enter the matrix: ");
        for(int row=0; row<arr.length; row++){
            // for each col in every row
            for(int col=0; col<arr[row].length;col++)
            arr[row][col] = s.nextInt();
        }
        // for output
        for(int row=0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
       s.close();
    }
    
}
