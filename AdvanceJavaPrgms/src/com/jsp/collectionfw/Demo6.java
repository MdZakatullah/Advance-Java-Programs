package com.jsp.collectionfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo6 {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		ListIterator i=a.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
	}
}
