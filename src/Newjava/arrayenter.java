package Newjava;

import java.util.Scanner;

public class arrayenter 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[3];
		System.out.println("Enter the numbers:");

		for(int i=0; i<=2; i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Entered numbers are:");
        for (int i = 0; i<=2; i++) 
        {
            System.out.println(arr[i]);
        }	

	}

}
