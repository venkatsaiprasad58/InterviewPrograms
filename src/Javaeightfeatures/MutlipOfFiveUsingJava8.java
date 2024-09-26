package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//From the given list of integers, print the numbers which are multiples of 5
//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/

public class MutlipOfFiveUsingJava8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 4, 3, 2, 6, 7, 8, 9, 12, 18, 20, 25, 20);

		List<Integer> multip5 = list.stream().filter(each -> each % 5 == 0).collect(Collectors.toList());

		System.out.println(multip5);

	}

}





