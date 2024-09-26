package patternprograms;

public class PrimeNumberProgramAgain {
	public static void main(String[] args) {

//		int start = 4;
//		int end = 10;
		
		String primenumbers = "";
		for (int i = 4; i <= 10; i++) {
			int count = 0;
			for (int number = i; number >= 1; number--) {
				if (i % number == 0) {
					count++;
				}
			}
			if (count == 2) {
				primenumbers = primenumbers + i + " ";
			}
		}
		System.out.println(primenumbers);
	}
}

//		int i = 0;
//		int num = 0;
//		// Empty String
//		String primeNumbers = "";
//
//		for (i = 4; i <= 10; i++) {
//			int counter = 0;
//			for (num = i; num >= 1; num--) {
//				if (i % num == 0) {
//					counter = counter + 1;
//				}
//			}
//			if (counter == 2) {
//				// Appended the Prime number to the String
//				primeNumbers = primeNumbers + i + " ";
//			}
//		}
//		System.out.println("Prime numbers from 1 to 100 are :");
//		System.out.println(primeNumbers);
//
//	}
//
////		int givenNumber = 9;
////		int count = 0;
////		
////		for(int i = 2; i< givenNumber/2; i++) {
////			if(givenNumber %2 ==0 ) {
////				count++;
////			}
////		}
////		if(count == 0) {
////			System.out.println("Given number is prime number:"+givenNumber);
////		}
////		else {
////			System.out.println("Given number is not a prime number"+givenNumber);
////		}
////}
