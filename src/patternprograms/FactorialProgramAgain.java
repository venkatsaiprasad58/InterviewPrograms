package patternprograms;

import java.util.Scanner;

public class FactorialProgramAgain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int fact = 1;
		for(int number = sc.nextInt(); number>=1; number--) {
			fact = fact*number;
		}
		System.out.println(fact);
	}
}
