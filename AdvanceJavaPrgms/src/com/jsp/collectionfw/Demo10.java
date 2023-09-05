package com.jsp.collectionfw;

import java.util.*;

public class Demo10 {

	public static void main(String[] args) 
	{
		String s1=new String("java");
		String s2=new String("java");
		
		Map m=new IdentityHashMap();
		m.put(s1, 1);
		System.out.println(m.get(s2));

	}

}
