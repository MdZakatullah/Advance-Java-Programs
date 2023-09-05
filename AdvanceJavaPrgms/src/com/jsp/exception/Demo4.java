package com.jsp.exception;

public class Demo4 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int [] a= {1,2,3,4,5};
		
		try {
			System.out.println(a[10]);
		}catch(ArithmeticException e) {}
		catch(NullPointerException e) {}
		catch(Exception e) {
			System.out.println("Array Handled");
		}
		
		
	}
}
