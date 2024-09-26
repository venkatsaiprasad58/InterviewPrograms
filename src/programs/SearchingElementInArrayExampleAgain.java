package programs;

public class SearchingElementInArrayExampleAgain {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 27, 333, 131, 1342, 134, 0, 1 };
		int temp;
		int number = 27;

		for (int i = 1; i < arr.length - 1; i++) {

			if (arr[i] == number) {

				System.out.println("Print the index of number:" + i);
			}
		}

	}

}
