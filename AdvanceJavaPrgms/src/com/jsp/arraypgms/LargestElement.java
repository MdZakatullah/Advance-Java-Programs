package com.jsp.arraypgms;

public class LargestElement {
	public static void main(String[] args) {
		int []a= {3,4,6,8,10,4};
		int s1=a[0];
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]>s1) {
				s1=a[i];
			}
		}
		System.out.println("Largest number is:"+s1);
	}

}
