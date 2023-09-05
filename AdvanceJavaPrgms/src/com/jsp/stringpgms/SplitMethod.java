package com.jsp.stringpgms;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String s1 = "java is an oop lang";
		
		String [] arr = s1.split(" ");
		
		for(String s:arr)     //for each loop
		{
			System.out.println(s);
		}
	}
}
