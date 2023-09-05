package com.jsp.stringpgms;

import java.util.Iterator;

public class GetString {

	public static void main(String[] args) 
	{
		String s1= "hello";
		
		for(int i=0; i<s1.length(); i++) //1st way to get given string
		{
			char c=s1.charAt(i);
			System.out.println(c);
		}
		
		char [] a = s1.toCharArray();
		for(char ch:a) {
			System.out.println(ch);	//2st way to get given string
		}
	}
}
