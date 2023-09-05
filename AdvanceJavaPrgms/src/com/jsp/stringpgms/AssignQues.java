package com.jsp.stringpgms;

import java.util.Scanner;

public class AssignQues {

	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = scn.next();
		
		
		String s2 ="";
		char[] a = s1.toCharArray();
		int i=0;
		
		while(i<a.length)
		{
			char c=a[i];
			if(a[i]==c)
			{
				char c1=(char) (c+2);
				
				s2=s2+c1;
			}	
		}
		System.out.println(s2);
	}
}
