package com.jsp.arraypgms;

public class SecondSmallestNum {

	public static void main(String[] args) 
	{
		int [] a = {10,5,8,4,9};
		int s1=a[0];
		int s2=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 && s1==s2)
			{
				s2=a[i];
			}
		}
		System.out.println("second smallest number = "+s2);

	}

}
