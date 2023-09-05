package com.jsp.stringpgms;

public class RevStringButNotEachChar {

	public static void main(String[] args)
	{
		String s1 = "java is an oop lang";
		String [] arr = s1.split(" ");
		String s2= "";
		
		for(int i=arr.length-1; i>=0; i--) {
			s2+=arr[i];
			s2+=" ";
		}
		s2=s2.trim();   //delete the last space
		System.out.println(s2);
	}
}
