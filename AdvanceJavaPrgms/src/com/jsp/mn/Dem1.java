package com.jsp.mn;

public class Dem1 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,7,7,7,4};
		int temp=a[0];
		int index=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>temp) {
				temp=a[i];
				index=i;
			}
		}
		System.out.println(index);

	}

}
