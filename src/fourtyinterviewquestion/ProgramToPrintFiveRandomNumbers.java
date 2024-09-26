package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.List;

//Write a program to print 5 random numbers in sorted order using forEach in Java 8?
public class ProgramToPrintFiveRandomNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 24, 3, 4, 5);

		list.stream().sorted().forEach(System.out::println);

	}

}
