
public class findSecondSmallestNum {

	int find2ndLarg(int arr[]) {

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 9, 6, 7, 1, 4 };

		findSecondSmallestNum o1 = new findSecondSmallestNum();
		int x = o1.find2ndLarg(arr);
		System.out.println("The smallerst Number is: "+x);

//		for (int xx : arr) {
//			System.out.println(xx + " ");
//		}

	}

}
