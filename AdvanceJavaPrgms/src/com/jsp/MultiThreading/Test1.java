package com.jsp.MultiThreading;

class B{
	public synchronized void m1(String s) {
		for(int i=1; i<=3; i++) {
			System.out.println("Executed By: "+s);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTh6 extends Thread{
	B b;
	String s;
	public MyTh6(B b, String s) {
		super();
		this.b=b;
		this.s=s;
	}
	public void run() {
		b.m1(s);
	}
}

public class Test1 {

	public static void main(String[] args) {
		B b=new B();
		B b1=new B();
		MyTh6 t=new MyTh6(b1, "t");
		MyTh6 t1=new MyTh6(b1, "t1");
		t.start();
		t1.start();
	}

}
