package com.jsp.arraypgms;

public class ArraySum {

	public static void main(String[] args) 
	{
		int sum=0;
		int [] a = {3,6,8,1,4};
		String s="";
		
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
			s+=a[i];
			if(i<a.length-1)s+="+";
			s = s+sum;
		}
		System.out.println(s);

	}

}
