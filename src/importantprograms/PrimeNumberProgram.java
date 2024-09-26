package importantprograms;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		// now need 4 to 20 prime numbers:
		String primeNumbers = "";
		for (int i = 4; i < 20; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Print prime numbers:" + primeNumbers);

//		int givenNumber = 9;
//		int count = 0;
//		for (int i = 2; i <= givenNumber / 2; i++) {
//			if (givenNumber % i == 0) {
//				count++;
//			}
//		}
//		if (count == 0) {
//			System.out.println("Given number is prime");
//		} else {
//			System.out.println("Given number is not prime");
//		}
//	}
	}
}
