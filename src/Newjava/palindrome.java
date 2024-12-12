package Newjava;
import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int o = n;                               // o = original number
        int r = 0;                               // r = reversed number
        int rem;

        while(n!=0) 
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        if (o==r)
        {
            System.out.println(o + " is a palindrome.");
        } 
        else 
        {
            System.out.println(o+ " is not a palindrome.");
        }
    }
}



// write a program to display alphabets a to z using loops
// write a program to print odd number from 1 to 99
// wap to display the fibonacci series
// write a do while loop program that asks the user to enter 2 numbers. The number should be added and the sum displayed. 
//the loop should asks whether he or she wishes to perform the operation again if so repeat otherwise the loop should terminate.
// write a program that prompts the user to input a positive integer. it should then output a message indicating whether the number is a prime number.
   



