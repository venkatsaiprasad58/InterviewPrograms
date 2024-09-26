package programs;

public class SortingExampleAgain {

	public static void main(String[] args) {

		int temp;

		int[] arr = { 12, 434, 132, 1, 0, 11 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[j];

					arr[j] = arr[i];
					
					arr[i] = temp;
				}
			}

		}
		for (int var : arr) {
			System.out.println(var);
		}

	}

}
