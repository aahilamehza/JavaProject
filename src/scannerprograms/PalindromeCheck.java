package scannerprograms;

import java.util.Scanner;

public class PalindromeCheck
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        
        for (int i=0;i<str.length();i++) 
        {
            if (str.charAt(i)!= str.charAt(str.length()-1-i)) 
            {
                System.out.println(str + " is not a palindrome");
                sc.close();
                return;
            }
        }
        System.out.println(str + " is a palindrome");
    }
}
