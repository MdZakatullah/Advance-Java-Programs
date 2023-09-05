package com.jsp.stringpgms;

import java.util.Scanner;

//important question of string
//input : aaabbc
//output : 3a2b1c

public class Count_Char_W_Numb {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner scn = new Scanner(System.in);
		String s1=scn.next();
		
		char []a=s1.toCharArray();
		String s2="";
		int i=0;
		
		while(i<a.length) {
			char c=a[i];
			i++;
			
			int count =1;
			while(i<a.length && a[i]==c) {
				count++;
				i++;
			}
			s2=s2+count+c;
		}
		System.out.println(s2);
	}

}
