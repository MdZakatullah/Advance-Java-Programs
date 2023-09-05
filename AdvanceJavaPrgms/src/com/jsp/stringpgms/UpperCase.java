package com.jsp.stringpgms;

public class UpperCase {

	public static void main(String[] args)
	{
		String s = "Abcd@123";
		String Res = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				Res+=(char) (s.charAt(i) - 32);
			}
			else
			{
				Res+=s.charAt(i);
			}
		}
		System.out.println(Res);
	}
}
