package programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeNumberAndString {

	public static void main(String[] args) {

		int number = 567;

		List<StringBuilder> collect = Stream.of(String.valueOf(number)).map(each -> new StringBuilder(each).reverse())
				.collect(Collectors.toList());
		System.out.println(collect);

		String str = "Venu";

		List<StringBuilder> collect2 = Stream.of(str).map(each -> new StringBuilder(each).reverse())
				.collect(Collectors.toList());

		System.out.println(collect2);
		

//		String str = "MOM", temp = "";
//		
//		for(int i = str.length()-1; i >= 0 ; i--) {
//			
//			temp = temp+str.charAt(i);			
//		}
//		
//		System.out.println(temp);
//		
//		if(temp.equals(str)) {
//			System.out.println("Given String is palindrome");
//		}
//		else {
//			System.out.println("Given String is not a palindrome");
//		}

//		int number = 1331, sum = 0 , remainder, temp = number;
//		
//		while(temp > 0) {
//			remainder = temp%10;
//			sum = sum*10 +remainder;
//			temp = temp/10;
//			
//		}
//		if(sum == number) {
//			System.out.println("Given num is palindrome");
//		}
//		else {
//			System.out.println("Given num is not a palindrome");
//		}

	}

}
