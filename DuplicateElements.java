
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrr[] = new int[] {1,2,4,4,5,8,8,3};
		System.out.println("Duplicate items are: ");
		
		for(int i=0 ; i<arrr.length; i++) {
			
			for(int j = i+1; j<arrr.length; j++)
			{
				if(arrr[i] == arrr[j])
				{
					System.out.println(arrr[j]);
				}
			}
		}
		
	}

}
