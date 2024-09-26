package programs;

public class StringProgramFromExam {

	public static void main(String[] args) {
//		String str1 = "venu";
//		String str2 = "gopal";
//
//		System.out.println(str1.equals(str1 = str2));
		
		String str = new String("Venu");
		StringBuilder build = new StringBuilder();
		build.append(str);
		build.reverse();
		System.out.println(build);
		
	}

}

