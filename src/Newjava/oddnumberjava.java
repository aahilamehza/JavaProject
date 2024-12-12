// write a program to print odd number from 1 to 99

package Newjava;

import java.util.Scanner;

public class oddnumberjava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("The odd number from 1 to 99 are:");		
		for(int i=1; i<=99; i++)
		if(i%2!=0)		
		{
			System.out.print(i+ " ");
		}
	}
}
