import java.util.Scanner;

public class checkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ex2: Write a Java program to test if an array contains a specific value
		
		
		int arr[] = {4,5,65,342,23};
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int check = input.nextInt();
		Boolean flag = false;
		
	//	int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==check) {
				flag = true;
				//count++;
				
			}
			
			
			}
		
		
	
		
		if(flag==true)
			System.out.println("I found your number in array");
		else
			System.out.println("NOT FOUND");
			
			
		
		
		
		
		
		}


}
