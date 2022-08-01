
public class sortingArray {
	
	static int[] bubbleSortArray(int arr[])
	{
		
		
		for ( int i = 0; i<arr.length; i++)
		{
			int temp = 0;
			for(int j = i+1; j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) // arr = {5,2,4,9,11,6,21}
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		return arr ;
	}
	
	static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {5,2,4,9,11,6,21};
		System.out.println("Before Sorting");
		printArray(arr);
		
		
		bubbleSortArray(arr);
		
		System.out.println("After sorting");
		printArray(arr);

		

	}

}
