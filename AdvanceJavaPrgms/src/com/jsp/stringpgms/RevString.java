package com.jsp.stringpgms;

public class RevString {

	public static void main(String[] args)
	{
		String s="ABCD";
		String Rev="";
		System.out.println("Before reverse string is: "+s);
		
		for(int i=s.length()-1; i>=0; i--)
		{
			Rev= Rev+s.charAt(i);
		}
		System.out.println("After reverse string is: "+Rev);
	}
}
