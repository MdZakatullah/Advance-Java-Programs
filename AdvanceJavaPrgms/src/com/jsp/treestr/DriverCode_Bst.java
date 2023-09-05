package com.jsp.treestr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DriverCode_Bst {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add(40);
		l.add(30);
		l.add(20);
		l.add(10);
		
		Collections.sort(l);
		for(Object s:l) {
			System.out.println(s);
		}
		
	}
}
