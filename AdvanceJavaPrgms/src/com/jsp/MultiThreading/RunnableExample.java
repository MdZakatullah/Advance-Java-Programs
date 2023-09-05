package com.jsp.MultiThreading;

public class RunnableExample 
{
	public static void main(String[] args) {
		System.out.println("Main starts");
		Runnable obj=new Creating1To10();
		Thread t1= new Thread(obj);
		t1.start();
		System.out.println("main ends");
	}

}
