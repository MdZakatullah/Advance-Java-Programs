package com.jsp.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNo_Val {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter phone number");
		String phno=scn.next();
		
		Pattern p= Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(phno);
		
		if(m.matches())
		{
			System.out.println("valid");	
		}
		else
		{
			System.out.println("invalid");
	     }
}
}
