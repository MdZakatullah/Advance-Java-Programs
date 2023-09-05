//package com.jsp.collectionfw;
//
//import java.util.*;
//
//public class Demo9 {
//
//	public static void main(String[] args) 
//	{
//		String s="banana";
//		Map<Character, String> m= new LinkedHashMap<Character,String>();
//		for(int i=0; i<s.length(); i++) {
//			char c=s.charAt(i);
//			if(m.containsKey(c)) {
//			String v=m.get(c);
//			v=v+","+i;
//			m.put(c, v);
//			}else {
//				m.put(c,i+"");
//			}
//		}
//		Set set = m.keySet();
//		Iterator i=set.iterator();
//		while(i.hasNext()) {
//			Object k=i.next();
//			Object v=m.get(k);
//			System.out.println(k+"="+v);
//		}
//		
//	}
//}
