package scannerprograms;

import java.util.Scanner;

public class EvenWordPrinter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();  
        String[] words = input.split(" ");
        int evenWordCount = 0;
        
        for (String word:words) 
        {
            if (word.length()%2==0) 
            {
                System.out.print(word + " ");
                evenWordCount++;
            }
        }       
        if (evenWordCount==0) 
        {
            System.out.println();
        }
    }
}
