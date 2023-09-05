package com.jsp.stringpgms;

public class LowerCase {

	public static void main(String[] args)
	{
		String s = "aBCD@123";
		String Res = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				Res+=(char) (s.charAt(i) + 32);
			}
			else
			{
				Res+=s.charAt(i);
			}
		}
		System.out.println(Res);
	}
}
