package com.jsp.MultiThreading;

public class Demo7 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);
	}

}
