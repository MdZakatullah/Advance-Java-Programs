package com.jsp.stringpgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pract2Ques {

	public static void main(String[] args) 
	{
		String s2="";
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m= p.matcher("aaabba");
		
		while(m.find())
		{
			String temp=m.group();
			s2=s2+temp.length()+temp.charAt(0);
		}
		System.out.println(s2);
	}
}
