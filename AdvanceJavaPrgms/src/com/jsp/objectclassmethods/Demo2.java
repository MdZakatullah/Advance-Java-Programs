package com.jsp.objectclassmethods;

class Circle
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
	
//	@Override
//	public boolean equals(Object arg)
//	{
//		if(!(arg instanceof Circle)) return false;
//		return this.radius((Circle)arg).radius;
//	}
}

public class Demo2 {

	public static void main(String[] args) 
	{
		Circle c1=new Circle(50);
		Circle c2=new Circle(50);
		
		System.out.println(c1==c2);      //compare address
		//System.out.println(c1.equals(c2));  //compare object

	}

}
