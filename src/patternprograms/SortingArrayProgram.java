package patternprograms;

import java.util.Arrays;

public class SortingArrayProgram {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 2};

		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
