// write a program that prompts the user to input a positive integer. it should then output a message indicating whether the number is a prime number.
   
package Newjava;

import java.util.Scanner;

public class positiveprimenumber
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a postive intger: ");
		int n = sc.nextInt();
		
		if (n<2) 
		{
	        System.out.println(n + " is not a prime number.");
	        return;
	    }
   
		for (int i=2; i<n; i++) 
	    {
	      if (n%i==0) 
	      {
	         System.out.println(n + " is not a prime number.");
	         return;
	      }
	    }

	        System.out.println(n + " is a prime number.");
	}
}

	