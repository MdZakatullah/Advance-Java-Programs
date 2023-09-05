//package com.jsp.MultiThreading;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Demo9 {
//
//	public static void main(String[] args)throws IOException{
//		File f=new File("E:\\File Handling2\\java.txt");
//		FileInputStream i=new FileInputStream(f);
//		if(f.canRead()) {
//			int n=i.read();
//			while(n!=-1) {
//				System.out.println((char)n);
//				n=i.read();
//			}
//		}else
//			System.out.println("cant't read...");
//		
//	}
//}
