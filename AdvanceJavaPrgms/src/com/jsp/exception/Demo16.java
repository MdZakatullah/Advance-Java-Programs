package com.jsp.exception;

public class Demo16 {

	public static void main(String[] args) 
	{
		String s=null;
		int n=0;
		System.out.println("Main Start");
		
		try {
			n=s.length();
		}catch(Exception e) {
			System.out.println(e);
			s="Ram";
		}
		System.out.println(n=s.length());
		System.out.println("Main End");
		
	}

}
