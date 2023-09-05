package com.jsp.SearchingAlgor;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int [] a= {2,4,5,7,8,9};
		System.out.println(search(a, 8));  //4th index
		System.out.println(search(a, 10)); //-1
	}
	
	static int search(int [] a, int x)
	{
		int start=0, end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(x==a[mid]) return mid;
			else if(x<a[mid]) return end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}
