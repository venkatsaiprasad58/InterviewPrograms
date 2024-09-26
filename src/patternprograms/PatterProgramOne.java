
package patternprograms;

import java.util.ArrayList;

public class PatterProgramOne {

	public static void main(String[] args) {

		// Array example
		int[] numbersArray = { 1, 2, 3, 4, 5 };
		System.out.println("Array length: " + numbersArray.length); // 4

		// Collection example
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		System.out.println("ArrayList size: " + numbersList.size()); // 5

		// Modify array and collection
		numbersArray[2] = 99; // Change value in array
		for (int x : numbersArray) {
			System.out.println(x);
		}
		numbersList.add(6); // Add element to list

		System.out.println("Modified array length: " + numbersArray.length); // 5
		System.out.println("Modified ArrayList size: " + numbersList.size()); // 6
	}
}
