import java.util.*;
public class BubbleSort {

    public static int[] sortedArray(int arr[]) {
        int temp = 0;
        // Bubble sort
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of an Array: ");
        int n = sc.nextInt();
 
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array: \n");
        
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        
        
        System.out.print("\nOriginal Array: ");
        for(int a: arr){
            System.out.print(a+" ");
        }
        
        
        
        
        sortedArray(arr);
        System.out.print("\nSorted Array: ");
        
        
        
        for(int a: arr){
            System.out.print(a+" ");
        }
        sc.close();

    }

}