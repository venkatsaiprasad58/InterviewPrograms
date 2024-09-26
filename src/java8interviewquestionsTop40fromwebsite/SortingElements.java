package java8interviewquestionsTop40fromwebsite;

public class SortingElements {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 3, 5, 6, 8, 9 };
		int temp;

		for (int i = 0; i <arr.length; i++) {

			for (int j = i+1; j <arr.length; j++) {

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
