package com.jsp.stringpgms;

                              //trim() method;

public class Demo4 {

	public static void main(String[] args) 
	{
		String s1= "  java Dev  ";
		System.out.println(s1.trim());   //"java Dev" //remove first and last spaces
		
		String s2 = "developer";
		System.out.println(s2.indexOf('e')); //1
		System.out.println(s2.indexOf("lop"));  //4
		System.out.println(s2.indexOf('x'));  //-1
		System.out.println(s2.indexOf('p'));  //6
		System.out.println(s2.indexOf('e',5));  //7
		System.out.println(s2.lastIndexOf('e'));  //7
	}

}
