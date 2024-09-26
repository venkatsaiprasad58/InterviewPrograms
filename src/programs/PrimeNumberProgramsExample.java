package programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberProgramsExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> numbers1 = new ArrayList<>();
		int limit = 20;
		
		for(int i = 0 ; i < 20 ; i++) {
			if(isPrime(i))
				numbers.add(i);
		}
		
		for(int i = 0 ; numbers1.size() < limit ; i++) {
			if(isPrime(i))
				numbers1.add(i);
		}
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		System.out.println(numbers1);
		System.out.println(numbers1.size());
	}
	
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1)
			return false;
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}		
		return true;		
	}

//		int number = 11;
//		int count = 0;
//
//		for (int i = 2; i < number / 2; i++) {
//
//			if (number % i == 0) {
//				count = count +1;
//			}
//           	
//		}
//		if(count == 0) {
//			System.out.println("Given number is prime number");
//		}
//		else {
//			System.out.println("Given number is not a prime number");
//		}

	
}
