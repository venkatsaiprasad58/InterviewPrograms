package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to square the list of numbers and then filter
//out the numbers greater than 100 and then find the average of the remaining numbers?

public class Java8ProgramQuestion22 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 30));

		Double collect = list.stream().mapToDouble(x -> x * x).filter(x -> x > 100).average().orElse(0);

		System.out.println(collect);

	}

}

