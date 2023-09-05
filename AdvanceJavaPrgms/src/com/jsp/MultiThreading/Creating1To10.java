package com.jsp.MultiThreading;

public class Creating1To10 implements Runnable
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
