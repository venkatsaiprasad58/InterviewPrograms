package programs;

import java.util.Scanner;

// Sorting a Program
public class SortingArrayProgram {

	public static void sortArray(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	public static void printArray(int[] array) {
		for (Integer i : array)
			System.out.print(" " + i);
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");

		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements into Array");
		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();
		}

		System.out.println("Before sorting the Array : ");
		printArray(array);
		
		sortArray(array);
		
		System.out.println("After sorting the Array : ");
		printArray(array);
	}

}
