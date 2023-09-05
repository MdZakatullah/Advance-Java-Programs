package com.jsp.TwoDArray;

public class AddingArray {

	public static void main(String[] args) 
	{
		int [][] a1= {{1,2,3}, {4,5,6}, {7,8,9}};
		int [][] a2= {{1,2,3}, {4,5,6}, {7,8,9}};
		int [][] sum=new int[3][3];
		
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a1[i].length; j++)
			{
				sum[i][j]=a1[i][j]+a2[i][j];
			}
		}
		for(int i=0; i<sum.length; i++)
		{
			for(int j=0; j<sum[i].length; j++)
			{
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
