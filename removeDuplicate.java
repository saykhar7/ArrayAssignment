
public class removeDuplicate {
	
	
	int[] sortedArray(int arr[]) {
        int temp = 0;
        // Bubble sort
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    return arr;
    }
	
	void duplicate(int arr[])
	{
		
		int []temp = new int[arr.length];
		int j = 0;
		
		

		for(int i = 0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j] = arr[i];
				j++;
			}
			
		}
		
		
		temp[j] = arr[arr.length-1];
		
		
		
		
		
		
		
		
		
//		for(int i=0; i<arr.length*2; i++)
//		{
//		
//			if(arr[i] != arr[i+1]) {
//				temp[j]=arr[i];
//			}
////			if(arr[i]==arr[i-1]) {
////				temp[j] = arr[i-1];
////				i++;
////			} else {
////				temp[j] = arr[i];}
////
////			j++;
//////			else {
//////				System.out.println("end of arr " + j);
//////				temp[j+1] = arr[arr.length-1];
//////			}
//		}
		//System.out.print("\n"+j);
		//temp[j++] = arr[arr.length-1];
		
		System.out.println();
		for(int k =0; k<=j; k++)
		{
			System.out.print(temp[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Unsorted array with duplicate elements");
		int []arr = {1,2,2,4,1,6};
		System.out.println();
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\n\nSorted array with duplicate elements");
		
		removeDuplicate o1 = new removeDuplicate();
		
		o1.sortedArray(arr);
		System.out.println();
		
		
		
		
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nSorted array with duplicate elements DELETED");
		o1.duplicate(arr);
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
