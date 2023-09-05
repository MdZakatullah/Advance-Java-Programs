package com.jsp.exception;

public class Demo9 {

	public static void main(String[] args) 
	{
		String s="ABC";
		try {
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}

	}
}
