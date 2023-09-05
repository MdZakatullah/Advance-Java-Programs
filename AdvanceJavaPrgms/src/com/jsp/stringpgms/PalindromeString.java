package com.jsp.stringpgms;

public class PalindromeString {

	public static void main(String[] args)
	{
		System.out.println(ispalindrome("malayalam"));
	}
	
		static boolean ispalindrome(String s)
		{
			s = s.toLowerCase();
			char [] a = s.toCharArray();
			int i=0; int j=a.length-1;
			
			while(i<j) {
				if(a[i]!=a[j]) return false;
				i++;
				j--;
			}
			return true;
		}
	}

