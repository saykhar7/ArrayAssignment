
public class duplicateString {
	//Ex8: Write a Java program to find the duplicate values of an array of	string values
	
	void duplicateString(String arr[])
	{
		for(int i =0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("Duplicate string is: "+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"shekahr", "basnet", "shiva", "sankhar", "shekahr"};
		
		
		
		duplicateString o1 = new duplicateString();
		
		o1.duplicateString(arr);

	}

}
