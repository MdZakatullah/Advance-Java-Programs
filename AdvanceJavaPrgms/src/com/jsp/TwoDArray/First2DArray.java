package com.jsp.TwoDArray;

public class First2DArray {

	public static void main(String[] args) 
	{
		int [] [] arr = new int [3][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=50;
		arr[1][1]=15;
		arr[1][2]=25;
		
		arr[2][0]=35;
		arr[2][1]=65;
		arr[2][2]=95;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
