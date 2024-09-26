package patternprograms;

public class FactorialProgram {

	public static void main(String[] args) {

		int fact = 1;
		for (int number = 5; number >= 1; number--) {
			fact = fact * number;

		}
		System.out.println(fact);
	}
}
