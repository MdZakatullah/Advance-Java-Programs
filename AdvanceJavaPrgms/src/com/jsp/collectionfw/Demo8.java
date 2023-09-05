package com.jsp.collectionfw;

import java.util.*;

public class Demo8 {

	public static void main(String[] args) 
	{
		Map m=new TreeMap();
		m.put("java", 75);
		m.put("python", 89);
		m.put("sql", 74);
		m.put("html", 99);
		m.put("javascript", 78);
		
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object k=i.next();
			Object v=m.get(k);
			System.out.println(k+" = "+v);
		}
		
				}
}
