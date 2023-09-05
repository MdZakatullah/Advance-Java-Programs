package com.jsp.MultiThreading;

class MyTh extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("child is executing");
		}
	}
}

public class Demo2 {

	public static void main(String[] args) 
	{
		MyTh t=new MyTh();
		t.start();
		System.out.println(10/0);
		for(int i=1; i<=5; i++) {
			System.out.println("main");
		}
	}
	
}
