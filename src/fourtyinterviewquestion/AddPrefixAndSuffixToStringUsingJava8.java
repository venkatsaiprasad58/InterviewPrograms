package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixAndSuffixToStringUsingJava8 {

	public static void main(String[] args) {

		String prefix = "Fruit:";
		String suffix = "is tasty";

		List<String> list = Arrays.asList("apple", "banana", "grapes", "watermelon");

		List<String> collect = list.stream().map(x -> prefix + x + suffix).collect(Collectors.toList());

		for(String l : collect) {
			System.out.println(l);
		}

	}

}
