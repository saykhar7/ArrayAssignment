
public class swapTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		
		int a = 0; //1
		int x =  0; //1
		int temp = 0; //1
		int temp2 = 0;
		
		for(int i =0; i<arr.length; i++)
		{
			
			
			temp = arr[a]; //1
			a++; //1
			
			
			 temp2 =arr[a];
			 
			arr[x] = temp2;
			x++;
			a++; //2
			
			
			arr[x]=temp;
			x++;
			
			i++;
	
		}
		
		for(int i :arr)
		{
			System.out.println(i+ " ");
		}
	}

}
