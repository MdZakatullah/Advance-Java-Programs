//package com.jsp.MultiThreading;
//
//class MyTh4 extends Thread{
//	static Thread m;
//	public void run() {
//		try {
//			m.join();
//		}catch(InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		for(int i=1; i<=3; i++) {
//			System.out.println("Child Thread");
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				
//			}
//		}
//	}
//}
//
//
//public class Demo4 {
//
//	public static void main(String[] args) throws InterruptedException{
//		MyTh4 m=Thread.currentThread();
//		
//		MyTh4 t=new MyTh4();
//		t.start();
//		t.join();
//		for(int i=1; i<=3; i++) {
//			System.out.println("Main class");
//			Thread.sleep(1000);
//		}
//	}
//
//}
