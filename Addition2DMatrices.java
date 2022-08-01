
public class Addition2DMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[][]  = {{1,3,5}, {3,4,5}};
		int br[][] = {{1,3,4}, {3,4,5}};
		
		//creating another marix to store the sum of two matrices
		
		int bc[][] = new int[2][3]; // 2 Row , 3 Col
		
		
		for(int i = 0; i<2;i++)
		{
			for(int j = 0; j<3; j++)
			{
				bc[i][j] = ar[i][j]+br[i][j];
				System.out.print(bc[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
