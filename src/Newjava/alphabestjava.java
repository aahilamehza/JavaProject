// write a program to display alphabets A to Z using loops

package Newjava;

import java.util.Scanner;

public class alphabestjava 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The Alphabets are: ");
		for(char alphabets='A'; alphabets<='Z'; alphabets++) 
		 {
	         System.out.print(alphabets + " ");            
		 }
	}

}
