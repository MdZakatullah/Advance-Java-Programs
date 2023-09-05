package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackReferance {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("([a-z])\\1+");
		Matcher m = p.matcher("aaaabnc");
		
		if(m.find())
		{
			System.out.println(m.group());  
		}
		System.out.println("Done");

	}

}
