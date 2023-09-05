package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[ab]");
		Matcher m = p.matcher("abcdbagh");
		
		while(m.find())
		{
			System.out.println("start="+m.start());
			System.out.println("end="+m.end());
			System.out.println("group="+m.group());
			
			System.out.println("---------------------------");
			
		}

	}

}
