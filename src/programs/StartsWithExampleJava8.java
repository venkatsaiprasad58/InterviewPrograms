package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithExampleJava8 {

	public static void main(String[] args) {

     List<String> list = Arrays.asList("Venu", "Anilu", "Pruthvi", "Ram");
     
     List<Character> vowels = Arrays.asList('a','e','i','o','u');
     
     List<String> strings = list.stream().filter(a -> a.startsWith("a") || a.startsWith("e") 
             || a.startsWith("i") ||
     a.startsWith("o") || a.startsWith("u") || a.endsWith("a") ||
     a.endsWith("e") || a.endsWith("i") || a.endsWith("o") ||
     a.endsWith("u"))
     .collect(Collectors.toList());
     
     List<String> stringsOne = list.stream().map(String::toLowerCase)
    		 .filter(s->(vowels.contains(s.charAt(0))) || vowels.contains(s.charAt(s.length()-1))) .collect(Collectors.toList());
     
     List<String> result = list.stream()

             .filter(s -> s.matches("^[aeiouAEIOU].*[aeiouAEIOU]$"))

             .collect(Collectors.toList());
     
     System.out.println(result);
     if(list.contains("Ojas")) {
    	 
    	 
     }
     
	}
}
