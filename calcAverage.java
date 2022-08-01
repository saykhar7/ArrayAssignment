
public class calcAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1: Write a Java program to calculate the average value of array
		
		int arr[] = {1,2,3,4,5};
		
		Double sum = 0.0;
		
		for(int i = 0;i<arr.length; i++)
		{
			sum = arr[i]+ sum;
			
		}
		
		System.out.println("Average of an array is: "+(sum/arr.length));

	}

}
