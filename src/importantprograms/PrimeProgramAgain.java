package importantprograms;

public class PrimeProgramAgain {
	public static void main(String[] args) {

		String primeNumber = "";
		for (int i = 4; i < 20; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeNumber = primeNumber + i + " ";
			}
		}
		System.out.println("PrimeNumber" + primeNumber);

//		int givenNumber = 9;
//		int count = 0;
//		
//		for(int i = 2; i<givenNumber/2 ; i++) {
//			if(givenNumber%i == 0) {
//				count ++;
//			}
//		}
//		if(count == 0) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}
	}

}
