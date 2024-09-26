package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class JoinStringswithPrefixandSuffix {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Gmail","Zero","Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		
		listOfStrings.stream().sorted(Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER)) .forEach(System.out::println);

		System.out.println("  ");
//		String listStrings = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
//		System.out.println(listStrings);

	}

}
