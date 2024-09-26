package programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class BasicOne {

	public static void main(String[] args) {

//		System.out.println('a' + "a");
//		System.out.println('a');

//		for (int i = 0; i < as.length; i++) {
//			System.out.println(as[i]);
//		}
		
		Stream<String> names = Arrays.asList("jack","alan","doug").stream();
		
		names.forEach(System.out::println);
		
		names.forEach(System.out::println);

	}
}
