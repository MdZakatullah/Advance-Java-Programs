package com.jsp.arraypgms;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[]a= {8,6,4,1,3,7};
		int s1=a[0];
		int s2=a[0];
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]>s1) {
				s2=s1;
				s1=a[i];
			}
			else if(a[i]>s2 || s1==s2) {
				s2=a[i];
			}
		}
		System.out.println("Second largest number is:"+s2);
	}
}
