package programs;

public class AgainCheckingPrimeNumberProgram {

	public static void main(String[] args) {
		int giveNumber = 13;
		int count = 0;
		for (int i = 2; i <= giveNumber; i++) {
			if (giveNumber % i == 0) {
				count++;
			} 
		}
			if(count == 1) {
				System.out.println("Given Number is Prime");
			} else {
				System.out.println("Given Number is not Prime");
			}
		}
}


