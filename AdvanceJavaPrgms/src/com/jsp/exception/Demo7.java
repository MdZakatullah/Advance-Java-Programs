package com.jsp.exception;

public class Demo7 {

	public static void main(String[] args) 
	{
		String s=null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Handled");
		}

	}
}
