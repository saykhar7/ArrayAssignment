import java.util.Scanner;

public class inputSortingArray {

	static int[] sortingArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if (arr[i] > arr[j]) // arr = { 5,2,3,7, 9 } 5>2
				{
					int temp = arr[j];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input the length of your array: ");
		int n = input.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print("\nEnter number for array " + i + ": ");
			arr[i] = input.nextInt();
		}

		// Now check sort
		printArray(arr);

	}

}
