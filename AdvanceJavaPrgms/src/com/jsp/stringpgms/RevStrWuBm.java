package com.jsp.stringpgms;

public class RevStrWuBm {

	public static void main(String[] args) 
	{
		String st = "java is an oop lang";
		char [] arr = st.toCharArray();
		int i=arr.length-1;
		int j=arr.length-1;
		String st2="";
		
		while(j>=0)
		{  
			while(j>=0 && arr[j]!=' ')
			{
				j--;
			}
			String t=""; int k=j+1;
			while(k<=i) {
				t+=arr[k];
				k++;
			}
			j--;
			i=j;
			st2+=t+" ";
		}
		System.out.println(st2);
}
}
