package com.js.sortingalgor;

public class MergeSort {

	public static void main(String[] args) 
	{
		int [] a= {4,8,1,2,9,10,3,12};
		sort(a);
		
		for(int n: a) System.out.print(n+ " ");
		
		System.out.println();
	}
	
	public static void sort(int [] a)
	{
		if(a.length==1) return;
		int [] left = new int [a.length/2];
		int [] right=new int[a.length-left.length];
		
		int i=0;
		while(i<left.length)
		{
			left[i]=a[i];
			i++;
		}
		int j=0;
		while(j<right.length)
		{
			right[j]=a[i];
			i++;
			j++;
		}
		sort(left);
		sort(right);
		merge(left,right,a);
			}
	
		private static void merge(int [] a, int [] b, int [] c)
		{
			int i=0; int j=0; int k=0;
			while(i<a.length && j<b.length)
			{
				if(a[i]<b[j]) c[k++]=a[i++];
				else c[k++]=b[j++];
			}
			
			while(i<a.length) c[k++]=a[i++];
			while(j<b.length) c[k++]=b[j++];
	}
}                                               

