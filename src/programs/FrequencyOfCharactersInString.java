package programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {

		String str = "Ojas innovative Technologies".replaceAll(" ", "").toLowerCase();

		System.out.println(str);
		
		Stream.of(str.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()))
		.entrySet().stream().forEach(System.out::println);
	
		
		 Stream.of(str.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);
				
	//	System.out.println(collect);

//		Map<Character, Integer> map = new HashMap<>();
//
//		for (char ch : str.toCharArray()) {
//			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
//		}
//
//		System.out.println(map);
	}
}
