package programs;

public class FactorialProgram {

	public static void main(String[] args) {

		int num = 4;
		int fact = 1;
		
		for(int i = num; i>=1; i--) {		
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
