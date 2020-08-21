package fundamentals;

import java.util.Scanner;

public class Array_2DDemo {

	public static void main(String[] args) {
	int r_range,c_range;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter row and col range for matrix:");
	r_range=sc.nextInt();
	c_range=sc.nextInt();
	int a[][]=new int[r_range][c_range];
	
	System.out.println("\n Now u have to enter "+(r_range*c_range)+" :");
	for(int i=0;i<r_range;i++)
	{
		for(int j=0;j<c_range;j++)
		{
			System.out.println("\n Enter a["+i+"]["+j+"]:");
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("\n Matrix is:");
	for(int i=0;i<r_range;i++)
	{
		for(int j=0;j<c_range;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

	}

}
