package importantprograms;

import java.util.stream.Collectors;

public class StripProgram {

	public static void main(String[] args) {

		String s = new String(" ");
		
		if(s.isBlank()) {
			System.out.println("return "+true);
		}
		else {
			System.out.println("returns");
		}

//		System.out.println("Java".repeat(2));

		System.out.println("Hello\nWorld".lines().collect(Collectors.toList()));

		String multiLines = "Hello\nWorld\nvenu!\ngopal";

		// multiLines.lines().filter(x ->
		// x.contains("venu")).forEach(System.out::println);
		
		multiLines.lines().forEach(System.out::println);

		Long collect = multiLines.lines().collect(Collectors.counting());
		System.out.println(collect);

//		String strip = s.strip();

//		String str = " Hello, World!  venu  ";
//
//		String stripLeading = str.stripTrailing();
//
//		System.out.println("stripLeading" + stripLeading);
//
//		String trim = str.trim();
//		System.out.println("trim checking" + trim);
//
//		String strip2 = str.strip();
//
//		System.out.println(strip);
//		System.out.println(strip2);

	}

}
