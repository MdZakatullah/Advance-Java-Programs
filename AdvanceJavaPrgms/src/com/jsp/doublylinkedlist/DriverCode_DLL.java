package com.jsp.doublylinkedlist;

public class DriverCode_DLL {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(3, 50);
		
		for(int i=0;i<l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();	
	}
}
