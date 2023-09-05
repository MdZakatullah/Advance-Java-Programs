package com.jsp.arraypgms;

public class SmallestNum {

	public static void main(String[] args) 
	{
		int [] a = {3,5,1,8,9,10};
		
		int small=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<small) small=a[i];	
		}
		System.out.println("small number = "+small);
	} 

}
