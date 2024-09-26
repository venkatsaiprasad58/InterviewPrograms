package programs;

public class FactorialProgramAgainExample {

	public static void main(String[] args) {

		int givenNumber = 4;
		int fact = 1;

		for (int i = 1; i <= givenNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of Given number:" + fact);

	}

}
