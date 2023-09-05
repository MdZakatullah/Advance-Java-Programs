package com.jsp.arraypgms;

public class SecondProg {

	public static void main(String[] args) 
	{
		int [] a1 = {3,6,8};
		int [] a2 = {2,3,5,7};
		m1(a1);
		m1(a2);
	}
	
	static void m1(int [] a)
	{
		for(int n:a)
		{
			System.out.println(n+" ");
		}
		System.out.println();
	}

}
