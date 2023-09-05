package com.jsp.exception;

public class Demo13 {

	public static void main(String[] args) 
	{
		System.out.println("Hello gd even");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Bye gd nt");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e);
			
		}
		System.out.println("Bye Bye :)");
	}

}
