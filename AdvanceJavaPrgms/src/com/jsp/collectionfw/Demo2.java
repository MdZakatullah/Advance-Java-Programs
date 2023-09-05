package com.jsp.collectionfw;


import java.util.*;
public class Demo2 {

	public static void main(String[] args) 
	{
		Set s=new HashSet();
		System.out.println(s.add("java"));
		System.out.println(s.add("java"));
		System.out.println(s.add("c"));
		
		System.out.println("size="+s.size());
	}

}
