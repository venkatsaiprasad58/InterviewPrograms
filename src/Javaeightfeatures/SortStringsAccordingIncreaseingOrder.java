package Javaeightfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of strings, sort them according to increasing order of their length?
public class SortStringsAccordingIncreaseingOrder {

	public static void main(String[] args) {
		
		List<String> listString = Arrays.asList("Venu","Ramya","Gopal", "Ram", "Reddy");
		
		listString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
	//	listString.stream().map(String::length).sorted().forEach(System.out::println);
		
	//  listString.stream().sorted().forEach(System.out::println);

	}

}


