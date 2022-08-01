
public class maxMin {

	void maxNum(int arr[])
	{
		int max = arr[0];
		for(int i = 1; i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Maximum value in array is: "+max);
		
		
		
	}
	
	void minNum(int arr[])
	{
		
		int min = arr[0]; // 44
		for(int i = 0; i<arr.length; i++)
		{
			
				if(arr[i]<min)// 31<44
				{
					min = arr[i];
					
				}
	
		}
		System.out.println("Minimum Number from array is: "+ min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 44,31,2,74,12};
		System.out.println("BELOW IS MY ARRAY");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		maxMin object1 = new maxMin();
		
		System.out.println();
		object1.maxNum(arr);
		object1.minNum(arr);
		//onje
		

	}

}
