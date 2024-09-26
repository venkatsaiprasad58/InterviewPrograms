package Javaeightfeatures;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

//Print duplicate characters in a string?
public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String str = "Venu Gopal Reddy";

		String str1 = str.replaceAll("\\s+", "");

		Set<String> set = new HashSet<String>();

		Stream.of(str1.split("")).filter(each -> !set.add(each)).forEach(System.out::println);
	}

}
