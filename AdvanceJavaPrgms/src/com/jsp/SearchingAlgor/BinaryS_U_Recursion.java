package com.jsp.SearchingAlgor;

public class BinaryS_U_Recursion {

	public static void main(String[] args) 
	{
		int [] a= {2,4,5,7,8,9};
		System.out.println(search(a, 8, 0, a.length-1)); //4
		System.out.println(search(a, 10, 0, a.length-1));  //-1

	}
	
	static int search(int [] a, int x, int start, int end)
	{
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(x==a[mid]) return mid;
		else if(x<a[mid]) return search(a, x, start, mid-1);
		else return search(a, x, mid+1, end);
	}

	}


