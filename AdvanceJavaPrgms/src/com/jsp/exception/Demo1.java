package com.jsp.exception;

public class Demo1 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		try {
		System.out.println(10/0);  //Arth a=new Arth();
		} catch(ArithmeticException e) {
			System.out.println("Handled");
		}
		
		System.out.println("Main End");
	}
}
