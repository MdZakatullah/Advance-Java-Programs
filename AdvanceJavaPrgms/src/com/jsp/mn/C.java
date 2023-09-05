package com.jsp.mn;

class Test
{
	static int a=20;
	public static void test() {
		System.out.println(a);
	}
}


public class C {

	public static void main(String[] args) 
	{
		(Test.a)--;
		Test.test();

	}

}
