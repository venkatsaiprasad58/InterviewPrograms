package Javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you get last element of an array?
public class FindLastElementInArray {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Venu", "Trisha", "Anil", "Kajal");

		list.stream().skip(list.size() - 1).forEach(System.out::println);

		List<String> collect = list.stream().skip(list.size() - 1).collect(Collectors.toList());

		System.out.println(collect);

	}

}
