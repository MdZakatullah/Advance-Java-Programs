package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("a[0-9]");
		Matcher m = p.matcher("a4bcabaogh");
		
		while(m.find())
		{
		System.out.println("start="+ m.start());
		System.out.println("end="+ m.end());
		System.out.println("end="+ m.group());
		
		System.out.println("------------------------");
		
//		Pattern p = Pattern.compile("a[2,3]c");
//		Matcher m = p.matcher("a4bcabaogh");
//		
//		while(m.find())
//		{
//		System.out.println("start="+ m.start());
//		System.out.println("end="+ m.end());
//		System.out.println("end="+ m.group());
//		
//		System.out.println("------------------------");
	}
}
}
