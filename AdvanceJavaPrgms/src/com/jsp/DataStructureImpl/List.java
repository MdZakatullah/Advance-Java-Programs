package com.jsp.DataStructureImpl;

import java.util.ArrayList;
public class List {

	public static void main(String[] args) 
	{
		ArrayList l= new ArrayList();
		l.add(3);
		l.add(2);
		l.add(5);
		l.add(4);
		System.out.println(l);
		
		Object e=3;
		l.remove(e);
		System.out.println(l);
		
		l.set(1, 75);
		System.out.println(l);

	}

}
