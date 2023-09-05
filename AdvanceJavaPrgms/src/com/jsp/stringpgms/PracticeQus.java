package com.jsp.stringpgms;

import java.util.Scanner;

public class PracticeQus {

	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scn.next();
		
		char [] a = s1.toCharArray();
		String s2="";
		int i=0;
		while(i<a.length)
		{
			char c=a[i];
			i++;
			int count=1;
			
			while(i<a.length && a[i]==c)
			{
				count++;
				i++;
			}
			s2=s2+count+c;
		}
		System.out.println(s2);
	}
}
