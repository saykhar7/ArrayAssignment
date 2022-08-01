
public class findDuplicate {
	
	void duplicate(int arr[])
	{
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++ )
			{
				if(arr[i] == arr[j])
				{
					System.out.println("DUPLICATE: "+arr[j]);
				}
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,5,5, 6, 8, 4, 11,6};
		
		findDuplicate o1 = new findDuplicate();
		o1.duplicate(arr);
		
	}

}
