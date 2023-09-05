package com.jsp.arraypgms;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int [] a = {4,6,8,1,6,9};
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
