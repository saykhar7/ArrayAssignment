import java.util.Scanner;

public class delArray {
	
//	4) Write a Java program to remove a specific element from an array

	void remove(int[] arr)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\nEner the number you want to del from array");
		int del = input.nextInt();
		
		for(int j =0; j<arr.length; j++)
		{
			if(del ==arr[j])
			{
				arr[j] = 0;
				System.out.println("DELETION SUCCESSFUL");
			}
		}
		
		System.out.println("New Array is: ");
		for(int k =0;k<arr.length; k++)
		{
			System.out.println(arr[k]+ " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,57,23,12,99};
		
		System.out.println("This is the array i have");
		for(int i = 0; i<arr.length; i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		
	delArray o1 = new delArray();
	o1.remove(arr);
		
		
		
		

	}

}
