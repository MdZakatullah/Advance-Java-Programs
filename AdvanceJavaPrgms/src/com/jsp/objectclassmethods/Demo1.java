package com.jsp.objectclassmethods;

class Book
{
	String title;
	Book(String t){
		title=t;
	}
	
	@Override
	public String toString() {
		return "Book[title]=" + title+"]";
	}
}

public class Demo1 {

	public static void main(String[] args) 
	{
		Book b=new Book("java");
		String s=b.toString();
		System.out.println(b);
		System.out.println(s);
	}
}
