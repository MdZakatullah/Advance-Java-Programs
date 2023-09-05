//package com.jsp.hashing;
//
//public class Set 
//{
//	private Node[]a=new Node[10];
//	private int count =0;
//	
//	public boolean add(int key) {
//		int index=key%10;
//		if(a[index]==null) {
//			a[index]=new Node(key,null);
//			count++;
//			return true;
//		}
//		Node prev=null;
//		Node curr=a[index];
//		while(curr!=null) {
//			if(curr.key==key) return false;
//			prev=curr;
//			curr=curr.next;
//		}
//		prev.next=new Node(key,null);
//		count++;
//		return true;
//	}
//	
//	public int size() {
//		return count;
//	}
//	
//	public String toString() {
//		display();
//		return null;
//	}
//	
//	public void display() {
//		for(int i=0; i<a.length; i++) {
//			Node curr=a[i];
//			while(curr!=null) {
//				System.out.println(curr.key);
//				curr=curr.next;
//			}
//		}
//	}
//
//}
