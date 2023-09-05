package com.jsp.MultiThreading;

class Customer{
	int balance=1000;
	
	public synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw..");
		if(balance<amount) {
			try {
				System.out.println("Less balance..");
				wait();
			}catch(InterruptedException e) {
			}
		}
		balance-=amount;
		System.out.println("withdraw done..");
	}
	
	public synchronized void deposit(int amount) {
		balance+=amount;
		notify();
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread() {
		public void run() {
			c.withdraw(15000);
		}
			
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}

}
