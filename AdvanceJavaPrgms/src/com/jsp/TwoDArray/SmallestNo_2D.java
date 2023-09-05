package com.jsp.TwoDArray;

public class SmallestNo_2D 
{
	public static void main(String[] args) 
	{
		int [][] a  = {{4,5,6},{2,1,7},{8,40,10}};
		System.out.println(minNum(a));	
	}
	
	public static int minNum(int[][] a)
	{
		int minNum=a[0][0];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[j][i]<minNum)
				{
					minNum=a[j][i];
				}
			}
		}
		return minNum;
	}

}
