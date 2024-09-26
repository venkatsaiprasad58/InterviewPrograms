package java8interviewquestionsTop40fromwebsite;

public class SingleTonDesignPatternProgram {

	public static void main(String[] args) {

		Demo obj1 = Demo.createInstance();
		Demo obj2 = Demo.createInstance();

		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class Demo {

	static Demo instance;

	private Demo() {

	}

	static Demo createInstance() {

		if (instance == null) {
			instance = new Demo();
		}

		return instance;
	}
}