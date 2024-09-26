package programs;

public class PrimeNumberProgramAgainExample {

	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 4; i <= 10; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

//		int GivenNumber = 5;
//		int count = 0;
//
//		for (int i = 2; i < GivenNumber / 2; i++) {
//			if (GivenNumber % 2 == 0) {
//
//				count = count + 1;
//			}
//		}
//		
//		if(count==0) {
//			System.out.println("Given number is prime number:"+GivenNumber);
//		}
//		else {
//			System.out.println("Given number is not a prime number:"+GivenNumber);
//		}
//
//	}

}