package com.jsp.exception;

public class Demo2 {

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int [] a= {1,2,3,4,5};
		try {
		System.out.println(a[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		
		System.out.println("Main End");
	}
}
