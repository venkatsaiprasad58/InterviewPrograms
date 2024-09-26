package fourtyinterviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNoofStringsListWhoseLenghtisGreaterthanFive {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Venu", "Gopal", "Reddy", "allagadda");

		Long collect = list.stream().filter(x -> x.length() > 5).collect(Collectors.counting());
		System.out.println(collect);

	}
}
