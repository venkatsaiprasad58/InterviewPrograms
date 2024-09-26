package Javaeightfeatures;

import java.util.stream.IntStream;
// How to find first 10 odd numbers
public class FirstTenOddNumbersUsingJava8 {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 100).filter(each -> each%2 ==0).limit(100).forEach(System.out::println);

	}

}
