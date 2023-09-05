package com.jsp.collectionfw;


import java.util.*;
public class Demo3 {

	public static void main(String[] args) 
	{
		Set s=new TreeSet();
		s.add("java");
		s.add("python");
		s.add("c");
		s.add("sql");
		
		for(Object o:s) {
			System.out.println(o);
		}
	}
}
