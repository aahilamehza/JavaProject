//write a do while loop program that asks the user to enter 2 numbers. The number should be added and the sum displayed. 
//the loop should asks whether he or she wishes to perform the operation again if so repeat otherwise the loop should terminate.

package Newjava;

import java.util.Scanner;

public class sumdisplay 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		do 
	   {
		  System.out.println("Enter the first number: ");
		  int n1= sc.nextInt();
	   	  System.out.println("Enter the second number: ");
		  int n2= sc.nextInt();
		  
		  int sum = n1+n2;
          System.out.println("The sum is: " + sum); 
          
          System.out.print("Do you want to perform the operation again? (yes/no): ");
        
	   }
		while(sc.next().equalsIgnoreCase("yes"));
	   }
    
}
