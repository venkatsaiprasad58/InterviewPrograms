package Javaeightfeatures;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Reverse each word of a string using Java 8 streams?
public class ReverseOfStringJava8 {
	
	public static void main(String[] args) {
		
		String str = "Trisha";
		
		String reverse = Stream.of(str.split(" ")).map(each -> (new StringBuilder(each)).reverse()).collect(Collectors.joining(" "));
		
		
		System.out.println(reverse);
	}

}
