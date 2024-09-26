package programs;

import java.util.Scanner;

public class SearchingOfElementInArray {

	public static void searchForAnElement(int[] array, int num) {
        int z = 0;
		for (int i = 0; i < array.length; i++) {

			if(array[i] == num) {
				
				System.out.println("Printing element:"+i);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the required or searching element:");
		int num = sc.nextInt();
		searchForAnElement(array, num);
	}

}
