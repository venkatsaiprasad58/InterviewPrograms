package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8ProgramToRemoveDuplicateElements {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Venu", "Gopal", "Venu", "Reddy", "Ojas", "Hyderabad"));

		List<String> count = list.stream().distinct().collect(Collectors.toList());

		System.out.println(count);

	}

}
