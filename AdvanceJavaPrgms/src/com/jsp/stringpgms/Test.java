package com.jsp.stringpgms;

public class Test {

	public static void main(String[] args) 
	{
//		String s1 = "java";   
//		String s2 = "java";
//		System.out.println(s1==s2);  //true
		
//		String s1="java";  //1st object create in scp
//		String s2=new String("java");   //2nd object create in Heap
//		System.out.println(s1==s2);//false
		
//		String s1 = "javadev";  //1st object
//		String s2 = "java";      //2nd object
//		String s3 = s2+"dev";   //3rd & 4th object
//		System.out.println(s1==s3); //false
		
		String s1="javadev";
		String s2="java"+"dev";
		System.out.println(s1==s2);//true

	}

}
