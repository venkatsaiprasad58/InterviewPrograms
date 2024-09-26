package programs;

public class SingleTonDesingPatternExample {

	public static void main(String[] args) {

		SingleTon single = SingleTon.getInstance();
		SingleTon singletwo = SingleTon.getInstance();

		System.out.println(single);
		System.out.println(singletwo);

	}

}

class SingleTon {

	static SingleTon instance = new SingleTon();

	private SingleTon() {

	}

	static SingleTon getInstance() {
//		if (instance == null) {
//			instance = new SingleTon();
//			System.out.println("called");
//		}

		return instance;
	}

}
