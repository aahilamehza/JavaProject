//wap to display the fibonacci series

package Newjava;

import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number of Fibonacci series: ");
		int n = sc.nextInt();

        int first=0, second=1;
        System.out.println("The Fibonacci series is: ");
        for(int i= 1; i<=n; i++)
        {
          System.out.print(first+ " ");
        
          int next=first+second;
          first= second;
          second= next;   
        }
    }
}


