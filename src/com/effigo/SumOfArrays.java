package com.effigo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfArrays {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,1,2,2,1,2,5,6,7,8,11};

//		int sum = Arrays.stream(arr).sum();
//		System.out.println(sum);
//
//		int sum2 = Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
//		System.out.println(sum2);
//	
		Arrays.stream(arr).boxed().toList().stream()
		.filter(n -> n>1 && IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
