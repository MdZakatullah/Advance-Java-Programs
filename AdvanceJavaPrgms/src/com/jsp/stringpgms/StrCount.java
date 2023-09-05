package com.jsp.stringpgms;

public class StrCount {

	public static void main(String[] args) 
	{
		String s = "ENGINEERING";
		char ch = 'E';
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
