package programs;

public class PalindromeNumberStringAgainExample {

	public static void main(String[] args) {
		
		int number = 167, sum = 0 , remainder, temp = number;
		
		while(temp > 0) {
			remainder = temp%10;
			sum = sum*10 +remainder;
			temp = temp/10;
			
		}
		if(sum == number) {
			System.out.println("Given num is palindrome");
		}
		else {
			System.out.println("Given num is not a palindrome");
		}

	}

}
