import java.util.*;
public class LargestElementinArray{

    public int largest(int[] arr, int n) {
    int Largest = arr[0];
    for(int i=1; i<n; i++){
        if( arr[i] > Largest){
            Largest = arr[i];
        }
    }
    return Largest;
}

public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number in the array:");
    int n = s.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i<n; i++){
        arr[i] = s.nextInt();
    }

    LargestElementinArray obj = new LargestElementinArray();
    int largestElement = obj.largest(arr,n);
    System.out.println("The largest element in the array is: "+largestElement);
    s.close();
   }
}
