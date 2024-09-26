package softwaretestinghelpcomjavaeightprograms;

import java.util.Random;

// Write a program to print 5 random numbers using forEach in Java 8?

public class PrintFiveRandomNumbersUsingJavaEight {

	public static void main(String[] args) {

		Random random = new Random();
		random.ints(2).limit(2).forEach(System.out::println);
		//random.ints().limit(5).forEach(System.out::println);
	}

}
