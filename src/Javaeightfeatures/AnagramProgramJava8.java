package Javaeightfeatures;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to check if two strings are anagrams or not?
public class AnagramProgramJava8 {

	public static void main(String[] args) {

		String str1 = "VenuGopal";
		String str2 = "u n V e p a l o G";
		

		str1 = Stream.of(str1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining("|", "}", "{"));
		
		System.out.println(str1);

		str2 = Stream.of(str2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());

		if (str1.equals(str2)) {
			System.out.println("Given strings are anagrams");

		} else {
			System.out.println("Given strings are not anagrams");
		}

	}

}
