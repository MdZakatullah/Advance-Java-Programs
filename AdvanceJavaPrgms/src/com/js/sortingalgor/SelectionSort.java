package com.js.sortingalgor;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int [] a= {4,2,5,8,9,10,6};
		sort(a);
		for(int n:a) System.out.println(n);
	}
	
	public static void sort(int [] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			int index=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[index]) index=j;
			}
					if(i!=index)
					{
						int t=a[index];
						a[index]=a[i];
						a[i]=t;
					}
				}
			} 
	}

