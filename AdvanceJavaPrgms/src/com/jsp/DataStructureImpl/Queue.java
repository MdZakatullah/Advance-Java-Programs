//package com.jsp.DataStructureImpl;
//    //Queue implementation using linked list
//public class Queue 
//{
//	private Node first=null;
//	private Node last=null;
//	private int count=0;
//	
//	private void add(Object e) {
//		if(first==null) {
//			first=new Node(e,null);
//			last=first;
//			count++;
//			return;
//		}
//		last.next=new Node(e,null);
//		last=last.next;
//		count++;
//	}
//	
//	private int size() {
//		return count;
//	}
//	
//	private boolean isEmpty()
//	{
//		if(size()==0)return true;
//		return false; 	
//	}
//	
//	private Object poll() {
//		if(isEmpty())return null;
//		Object e=first.ele;
//		first=first.next;
//		count--;
//		if(isEmpty()) last=null;
//		return e;
//	}
//	
//	public Object peek() {
//		if(isEmpty()) return null;
//		return first.ele;
//	}
//
//}
