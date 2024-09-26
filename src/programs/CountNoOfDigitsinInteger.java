package programs;

public class CountNoOfDigitsinInteger {

	public static void main(String[] args) {

		int number = 13490;
		int count = 0;

		while (number > 0) {
			count = count + 1;
			number = number% 10;
		}

	System.out.println(count);
	}

}
