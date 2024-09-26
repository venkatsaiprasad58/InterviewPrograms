package importantprograms;

public class FactorialProgram {

	public static void main(String[] args) {

		int fact = 1;
		int number = 5;
		for (int i = number; number > 1; number--) {
			fact = fact * number;
		}
		System.out.println(fact);
	}

}
