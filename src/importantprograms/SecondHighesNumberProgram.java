package importantprograms;

import java.util.Arrays;

public class SecondHighesNumberProgram {

	public static void main(String[] args) {

		int[] arr = { 9, 4, 2, 21, 42, 123, 5};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]  < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
