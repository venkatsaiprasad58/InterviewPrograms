package com.humancloud;

public class SingleTonDemo {
	
	public static void main(String[] args) {
		
		Demo d = Demo.getInstance();
		Demo d1 = Demo.getInstance();
		
		System.out.println(d);
		System.out.println(d1);
	}
}

class Demo {
	private static Demo instance;
	
	private Demo() {
	}

	public static Demo getInstance() {
		if(instance ==null) {
			instance = new Demo();
		}
		return instance;
	}
}