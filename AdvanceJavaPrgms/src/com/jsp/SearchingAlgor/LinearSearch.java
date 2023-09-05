package com.jsp.SearchingAlgor;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int [] a= {3,6,1,8,4};
		System.out.println(search(a, 8));   //3 (on 3rd index)
		System.out.println(search(a, 10));  //-1(because 10 is not available in array)

	}
	
	static int search(int [] a, int x)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==x) return i;
		}
		return -1;
	}

}
