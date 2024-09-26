package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a Java 8 program to get the sum of all numbers present in a list?
public class SumOfNumbersProgramJava8 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		int sum = list.stream().mapToInt(x -> x).sum();

		System.out.println(sum);
	}
}
