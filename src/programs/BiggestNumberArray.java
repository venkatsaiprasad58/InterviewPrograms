package programs;

import java.util.Scanner;

public class BiggestNumberArray {

	public static int getBiggestNumberInArray(int array[]) {
		int big = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > big) {
				big = array[i];
			}
		}
		return big;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements in the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(getBiggestNumberInArray(array));
	}
}


