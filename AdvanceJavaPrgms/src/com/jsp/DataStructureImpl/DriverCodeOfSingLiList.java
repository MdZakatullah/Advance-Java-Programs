package com.jsp.DataStructureImpl;

public class DriverCodeOfSingLiList {

	public static void main(String[] args) 
	{
		LinkedList l= new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.reverse();
		//l.remove(2);
		//l.add(3, 50);
		
		//for(int i=0; i<l.size(); i++) {
			//System.out.println(l.get(i));
		//}
		
		System.out.println(l);

	}

}
