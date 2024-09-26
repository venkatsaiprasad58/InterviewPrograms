
package programs;

public class MultiThreadingExample {

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
//			MultiThread t = new MultiThread();
			Thread t = new Thread(new MultiThread());
			t.start();
		}

	}

}
class MultiThread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}