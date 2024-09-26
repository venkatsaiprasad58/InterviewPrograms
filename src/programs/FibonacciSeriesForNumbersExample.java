package programs;

public class FibonacciSeriesForNumbersExample {

	public static String fibonacci(int num) {
		String f1 = "0", f2 = "1";
		String sum = "";
		if (num < 0) {
			return "0";
		}
		if (num < 1) {
			return "1";
		} else {
			for (int i = 2; i <= num; i++) {
				sum = f1+f2;
				f1 = f2;
				f2 = sum;
			}
		}
		return sum;
	}

//	public static String add(String f1, String f2) {
//		return f1 + f2;
//	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(fibonacci(num));
	}

}
