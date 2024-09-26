package Javaeightfeatures;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find first repeated character in a string?
public class FindRepeatedCharacterString {

	public static void main(String[] args) {

		String inputString = "Jacav Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstRepeatedChar = charCountMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).findFirst().get();

		System.out.println(firstRepeatedChar);

//		String str = "Ojas innovative Technologies".replaceAll("\\s+", "").toLowerCase();
//		
//		Map<String, Long> map = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//	 map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(1).forEach(System.out::println);
//		
//		//<Entry<String, Long>> sorted =
//		//sorted.forEach(System.out::println);
//		//System.out.println(sorted);
	}
}
