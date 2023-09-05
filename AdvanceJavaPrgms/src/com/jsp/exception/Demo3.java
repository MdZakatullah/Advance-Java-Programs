package com.jsp.exception;

public class Demo3 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int []a= {1,2,3,4,5};
		try {
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Arth Handled");
		}
		catch(NullPointerException e) {
		System.out.println("Null Handled");
		}
		System.out.println("Main End");
		
	}
}
