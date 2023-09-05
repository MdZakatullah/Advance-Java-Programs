package com.jsp.exception;

public class Demo8 {

	public static void main(String[] args) 
	{
		String s1="Ram";
		String s2=null;
		System.out.println("-----------------");
		try {
			System.out.println(s2.equals(s1));
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
