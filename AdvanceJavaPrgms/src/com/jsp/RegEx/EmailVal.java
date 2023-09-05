package com.jsp.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVal {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Email:");
		String email=scn.next();
		
		String re="[a-z A-Z]\\S*@[a-z A-Z]+[.](com|co\\.in|ac.in)";
		
			Pattern p = Pattern.compile(re);
			Matcher m = p.matcher(email);
			
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
