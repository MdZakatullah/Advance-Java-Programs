package com.jsp.MultiThreading;

import java.io.FileWriter;
import java.io.IOException;

public class Demo11 {

	public static void main(String[] args) throws IOException{
		FileWriter w=new FileWriter("E:\\File Handling3\\java.txt");
		char[]ch= {'i','1','h','u'};
		w.write("Ramana...\n");
		w.write(ch);
		w.write(65);
		w.close();

	}
}
