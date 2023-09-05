package com.jsp.MultiThreading;

public class CreatingThread {

	public static void main(String[] args) {
		System.out.println("main starts");
		Thread t1=new MyThread();
		t1.start();
	    Thread t2=new PrintAToZ();
	    t2.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}


