package com.jsp.stringpgms;

public class Panagram {

	public static void main(String[] args) 
	{
		System.out.println(panagram("qwertyuioplkjhgfdsazxcvbnm"));		
	}
	
	static boolean panagram(String s1)
	{
		for(char c='a'; c<='z'; c++)
		{
			if(s1.indexOf(c)==-1) return false;
		}
		return true;
	}

}
