package com.jsp.MultiThreading;

class C{
	public synchronized void d1(D d) {
		System.out.println("d1 mthod of C class");
		System.out.println("C class calling D class Tag Method");
		d.tag();
	
	}
	public synchronized void tag() {
		System.out.println("tag method of C class");
	}
}

class D{
	public synchronized void d1(C c) {
		System.out.println("d1 method of D class");
		System.out.println("D class calling C class Tag Method");
		c.tag();
		
	}
	public synchronized void tag() {
		System.out.println("tag method of D class");
	}

}
class MyTh7 extends Thread{
	C c=new C();
	D d=new D();
	
public void run() {
	c.d1(d);
}
public void m1() {
	this.start();
	d.d1(c);
}
}

public class Demo6 {

	public static void main(String[] args) {
		MyTh7 t=new MyTh7();
		t.m1();
	}
}
