package com.humancloud;

import java.util.Random;

public class GenerateOTPExample {

	public static void main(String[] args) {

		String numbers = "123456789";

		Random random = new Random();

		char[] OTP = new char[6];

		for (int i = 0; i < 6; i++) {
			OTP[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		String OTP2 = "";
		for (char c : OTP) {
			OTP2 = OTP2 + c;
		}
		String otpMsg  = OTP2;
		
		System.out.println(otpMsg);
	}
}
