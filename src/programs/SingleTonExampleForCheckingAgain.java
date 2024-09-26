package programs;

public class SingleTonExampleForCheckingAgain {

	public static void main(String[] args) {
		SingleTone single = SingleTone.getInstance();
		SingleTone second = SingleTone.getInstance();

		System.out.println(single);
		System.out.println(second);
	}

}

class SingleTone {
	static SingleTone instance;

	public SingleTone() {

	}

	static SingleTone getInstance() {
		if (instance == null) {
			instance = new SingleTone();
		}
		return instance;
	}
}