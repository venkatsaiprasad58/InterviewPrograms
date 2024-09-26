package com.humancloud;

public class AdditionOfTwoStringsExample {

	public static void main(String[] args) {

		String str1 = "999";
		String str2 = "10";

		System.out.println(addTwoStringIntegers(str1, str2));
	}

	public static String addTwoStringIntegers(String str1, String str2) {
		int strOneLenght = str1.length();
		int strTwoLenght = str2.length();
		int carry = 0;
		String sum = "";

		if (strOneLenght < strTwoLenght) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		int l1 = str1.length() - 1;
		int l2 = str2.length() - 1;

		for (int i = 0; i <= l1; i++) {
			int num1 = Integer.parseInt(str1.charAt(l1 - i) + "");
			int num2 = l2 >= i ? Integer.parseInt(str2.charAt(l2 - i) + "") : 0;

			int add = num1 + num2 + carry;
			carry = add / 10; //
			sum += add % 10;
		}
		if (carry > 0) {
			sum += carry;
		}

		StringBuilder sb = new StringBuilder(sum);
		return sb.reverse().toString();

	}

}
