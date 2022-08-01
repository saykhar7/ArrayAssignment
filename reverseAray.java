
public class reverseAray {
	
	void reverse(int arr[])
	{
		System.out.println("\n\nReverse is: ");
		for(int i =arr.length; i>=1;i--)
		{
			
				System.out.print(i+ " ");
				
			
			
//			for(int j =0;j<arr.length;j++)
//			{
//				temp[j] = arr[i];
//			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr  = {1,2,3,4,5};
		
		for(int i:arr)
		{
			System.out.print(i+ " ");
			
		}
		
		reverseAray o1 = new reverseAray();
		o1.reverse(arr);
		
		
	}

}
