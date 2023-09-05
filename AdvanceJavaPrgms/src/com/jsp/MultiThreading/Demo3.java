package com.jsp.MultiThreading;

class MyTh3 extends Thread{
	public void run() {
		Thread.currentThread().setPriority(9);
		for(int i=1; i<=3; i++) {
			System.out.println("child Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class Demo3 {

	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().setPriority(4);
		MyTh3 t=new MyTh3();
		t.start();
		for(int i=1; i<=3; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}

}
