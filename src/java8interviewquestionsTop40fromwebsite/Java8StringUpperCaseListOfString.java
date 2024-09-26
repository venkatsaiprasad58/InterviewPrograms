package java8interviewquestionsTop40fromwebsite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8StringUpperCaseListOfString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(Arrays.asList("Venu", "trisha", "Gopal", "ramudu"));

		list.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
	}

}
