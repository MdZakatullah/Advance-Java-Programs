package com.jsp.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Val {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter password");
		String password=scn.next();
		
		String re = "(?=.*[!@#%^*+=]) (?=.*[a-z]) (?=.*[A-Z]) (?=.*[0-9]).{6,10}";
		
		Pattern p= Pattern.compile(re);
		Matcher m = p.matcher(password);
		
		if(m.matches())
		{
			System.out.println("valid");	
		}
		else System.out.println("invalid");

	}

}
