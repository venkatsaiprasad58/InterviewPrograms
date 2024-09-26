package programs;

import java.lang.Thread.State;

public class ThreadMethodChecking {

	public static void main(String[] args) {
		
		 Thread currentThread = Thread.currentThread();
	        System.out.println("Current thread: " + currentThread.getName());
	        System.out.println("Priority: " + currentThread.getPriority());
	        System.out.println("Thread ID: " + currentThread.getId());
	        System.out.println("Thread state: " + currentThread.getState());

//		Thread t2 = new Thread();
//		State state = t2.getState();
//		System.out.println("AnotherThreadstate" + state);
//		String name = t2.getName();
//		System.out.println("AnotherThradname" + name);
//		Thread t = new Thread();
//		String threadname = t.getName();
//		System.out.println(threadname);
//		int priority = t.getPriority();
//		System.out.println(priority);
//		long id = t.getId();
//		System.out.println(id);
	}

}
