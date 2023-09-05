package com.jsp.DataStructureImpl;

public class DriverCode {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		
		//System.out.println("size="+l.size());
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(1,50);
		l.add(60);
		
		System.out.println(l);
		
		for(int i=1; i<l.size(); i++)
		{
			int n=(Integer)l.get(i);
			System.out.println(n);
			
			//System.out.println("size="+l.size());
		}
	}
}
