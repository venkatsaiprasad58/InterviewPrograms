package programs;

import java.util.Arrays;
import java.util.List;

public class InterviewQuestionOnJava8features {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(10000, 10000, 4243,10000,432,443);
		
		li.stream().filter(each -> each >= 5000).map(each -> each * 1.15).forEach(System.out::println);
		
	}
}
