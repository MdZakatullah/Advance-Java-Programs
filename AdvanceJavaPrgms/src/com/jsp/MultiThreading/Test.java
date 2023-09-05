//package com.jsp.MultiThreading;
//
//class A{
//	public synchronized void m1(String s) {
//		for(int i=1; i<=3; i++) {
//			System.out.println("Executed By: "+s);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}	
//	}
//}
//class MyTh9 extends Thread{
//	A a;
//	String s;
//	public MyTh9(A a,String s) {
//		super();
//		this.a=a;
//		this.s=s;
//	}
//	public void run() {
//		a.m1(s);
//	}
//}
//
//
//public class Test {
//
//	public static void main(String[] args) {
//		A a=new A();
//		MyTh9 t=new MyTh9(a, "t");
//		MyTh9 t1=new MyTh9(a, "t1");
//		t.start();
//		t1.start();
//
//	}
//
//}
