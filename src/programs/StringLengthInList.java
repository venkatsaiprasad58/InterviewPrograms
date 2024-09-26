
package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLengthInList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(
				Arrays.asList("Kajal", "Trisha", "Priyanka", "Sreeleela", "Jayasree", "Sirisha"));
		
		
		list.stream().map(each -> each +" = "+each.length()).forEach(System.out::println);
		
		
//
//		list.stream().map(each -> (each + " = " + each.length())).forEach(System.out::println);

	}

}
