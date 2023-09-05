package com.jsp.arraypgms;

public class FirstArrayProg {

	public static void main(String[] args) 
	{
		int [] a = new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		int [] b = a;
		b[0] = 25;
		
		for(int n:a)
		{
			System.out.println(n);
		}
	}
}
