package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Write a Java 8 program to concatenate two Streams?
public class Java8ProgramToConcatenateTwoStreams {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6));

		List<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 4, 1));

		List<Integer> list2 = Stream.concat(list.stream(), listTwo.stream()).toList();

		System.out.println(list2);

	}

}
