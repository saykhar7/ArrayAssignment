
public class findDup {

	// Write a Java program to find the common elements between two	arrays (string values)
	
	void DupString(String a[], String b[])
	{
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				if(a[i].equals(b[j]))
				{
					System.out.println("Duplication string is: "+b[j]);
				}
			}
			System.out.println("helll");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"a", "b", "r", "w"};
		String b[] = {"c", "q", "p", "a"};
		
		findDup o1 = new findDup();
		
		o1.DupString(a, b);

	}

}
