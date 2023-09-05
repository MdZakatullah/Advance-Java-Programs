package com.jsp.objectclassmethods;

class Rectangle
{
	int length;
	int breath;
	
	 Rectangle(int l, int b)
	{
		 length=l;
		 breath=b;
	}
//	 @Override
//	 public boolean equals(Object arg)
//	 {
//		 if(!(arg instanceof Rectangle)) return false;
//		return length==r.length && breath==r.breath;
//	 }
}

public class Demo3 {

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(10, 20);
		Rectangle r2=new Rectangle(10, 30);
		Rectangle r3=new Rectangle(10, 20);
		
		System.out.println(r1.equals(r2));  //false
	  //System.out.println(r1.equals(r3));   //true

	}

}
