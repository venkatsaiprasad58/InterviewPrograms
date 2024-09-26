package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
public class Java8NoOfStringsAndLength {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("venu", "Gopal", "Ram", "OjasHyderabad"));

		Long collect = list.stream().filter(x -> x.length() > 5).count();
		System.out.println(collect);

	}

}
