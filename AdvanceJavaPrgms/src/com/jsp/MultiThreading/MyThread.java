package com.jsp.MultiThreading;

public class MyThread extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(450);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
