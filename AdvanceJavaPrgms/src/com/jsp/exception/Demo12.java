package com.jsp.exception;

public class Demo12 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally Block");
		}
		System.out.println("Main End");
	}

}
