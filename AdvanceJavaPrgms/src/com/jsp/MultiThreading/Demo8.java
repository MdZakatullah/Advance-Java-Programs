//package com.jsp.MultiThreading;
//
//class T1 extends Thread{
//	public void run() {
//		for(int i=1;i<=10; i++) {
//			System.out.println(i+"child");
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class Demo8 {
//
//	public static void main(String[] args) throws InterruptedException {
//		T1 t=new T1();
//		t.setDaemon(true);
//		t.start();
//		for(int i=1; i<=5; i++) {
//			System.out.println(i+"Main");
//			Thread.sleep(1000);
//		}
//		
//	}
//}
