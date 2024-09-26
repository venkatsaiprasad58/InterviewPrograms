package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java 8 program to square the list of numbers and then filter out the numbers greater than 100 
//and then find the average of the remaining numbers?

public class QuestionTwentyTwo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 5, 60));
		 list.stream().map(x -> x * x).filter(x -> x > 100).forEach(System.out::println);
		//		.collect(Collectors.averagingInt(Integer::intValue));
	//	list.stream().map(x -> x *x).filter(x -> x>100).forEach(System.out::println);
//		System.out.println(collect);

	}

}

