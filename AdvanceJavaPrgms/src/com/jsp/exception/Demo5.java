package com.jsp.exception;

public class Demo5 {

	public static void main(String[] args) 
	{
System.out.println("Main Start");
		
		try {
			System.out.println(10/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Block");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Block");
		}
		catch(Exception e) {
			System.out.println("Array Block");	
		}

	}

}
