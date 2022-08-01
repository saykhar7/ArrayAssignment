
public class oddEvenFinder {
	
	
	int []odd (int arr[])
	{
		int j = 0;
		int temp[] = new int[arr.length];
		
		for(int a=0; a<arr.length; a++)
		{
			
				if(arr[a]%2 ==0)
				{
					temp[j] = arr[a];
					j++;
				}
				
		}
		
		for(int a=0; a<arr.length; a++)
		{
			
				if(arr[a]%2 !=0)
				{
					temp[j] = arr[a];
					j++;
				}
				
		}
		
		
		return temp;
	}
	
	int []sort (int arr[])
	{
		int temp = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
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
		
		
		int arr[] = {9,5,8,1,6,2,3};
		
		System.out.println("ORIGINAL ARRAY: ");
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
			
			
		}
		
		
		System.out.println();
		
		
		oddEvenFinder o1 = new oddEvenFinder();
		o1.sort(arr);
		
		System.out.println("_________________________________________\n");
		System.out.println("Required ARRAY: \n");
		
		for(int x : o1.odd(arr))
		{
			System.out.print(x+" ");
		}
		
		
		
			
	

	}

}
