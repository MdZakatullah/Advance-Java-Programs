package com.jsp.TwoDArray;

public class DiagonalSum {

	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3}, {4,5,6}, {7,8,9}};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(i==j)
				{
					sum1+=a[i][j];
				}
				if(i+j==a.length-1)
				{
					sum2+=a[i][j];
				}
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
