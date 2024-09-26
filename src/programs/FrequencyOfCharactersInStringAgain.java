package programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharactersInStringAgain {

	public static void main(String[] args) {
		String str = "Venugopalreddyallagadda";

		Stream.of(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.forEach(System.out::println);

	}

}
