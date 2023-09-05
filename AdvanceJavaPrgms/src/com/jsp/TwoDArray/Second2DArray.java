package com.jsp.TwoDArray;

import java.util.Scanner;

public class Second2DArray {

	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int rowSize=scn.nextInt();
		
		System.out.println("Enter column size:");
		int colSize=scn.nextInt();
		
		int [][] arr=new int[rowSize][colSize];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter value for " +i+ " row");
			
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
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
