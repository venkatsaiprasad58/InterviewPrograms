package programs;

import java.util.Scanner;

// Print Table 5
public class PrintTableInJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int nextInt = sc.nextInt();

		System.out.println("Enter Range");

		int range = sc.nextInt();

		for (int i = 1; i <= range; i++) {

			System.out.println(nextInt + "*" + i + "=" + nextInt * i);

		}
	}

}
