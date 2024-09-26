package softwaretestinghelpcomjavaeightprograms;

import java.math.BigInteger;

//Write a Java 8 program to get the sum of all numbers present in a list?
public class GetSumOfNumbersPresentInList {

	public static void main(String[] args) {

		String s1 = "8888888888";
		String s2 = "9999999999";

		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		BigInteger big1 = new BigInteger(s1);
		BigInteger big2 = new BigInteger(s2);

		System.out.println(big1);
		System.out.println(big2);

		BigInteger bigInteger = big1.add(big2);
		System.out.println("checking big integer"+bigInteger);

	//	System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

		System.out.println(s1 + s2);

//		List<Integer> list = Arrays.asList(25, 25, 50, 100);
//
//		Long collect = list.stream().collect(Collectors.summarizingInt(x -> x)).getSum();
//
//		int sum = list.stream().mapToInt(x -> x).sum();
//		System.out.println(sum);
//
//		System.out.println(collect);

	}

}
