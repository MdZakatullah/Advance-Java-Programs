package com.jsp.exception;

public class Demo11 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
		
	}
}
