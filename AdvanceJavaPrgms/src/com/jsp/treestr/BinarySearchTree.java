package com.jsp.treestr;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree 
{
	private Node root=null;
	private int count=0;
	private boolean flag;
	
	public boolean add(int k) {
		flag =true;
		root=addNode(k,root);
		return flag;
	}
	
	private Node addNode(int k,Node n) {
		if(n==null) {
			count++;
			return new Node(k);
		}
		if(k<n.key) {
			n.left=addNode(k, n.left);
		}else if(k>n.key) {
			n.right=addNode(k, n.right);
		}else {
			flag =false;
		}
		return n;
	}
	
	public int size() {
		return count;
	}
	
	public void levelorderTraverse()
	{
		Queue <Node> q= new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty())
		{
			Node n=q.poll();
			System.out.println(n.key+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
			}
		System.out.println();
	}
	
	public void preorderTraverse()
	{
		preorder(root);
		System.out.println();	
	}
	private void preorder(Node n)
	{
		if(n==null)return;
		System.out.println(n.key+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public void postorderTraverse()
	{
		postorder(root);
		System.out.println();	
	}
	private void postorder(Node n)
	{
		if(n==null)return;
		postorder(n.left);
		postorder(n.right);
		System.out.println(n.key+" ");
	}
	
	public void inorderTraverse()
	{
		inorder(root);
		System.out.println();	
	}
	private void inorder(Node n)
	{
		if(n==null)return;
		inorder(n.left);
		System.out.println(n.key+" ");
		inorder(n.right);	
	}


}
