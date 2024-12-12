package abstractclassess;

import java.util.Scanner;

public class stringreorder 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string :");
        String input=scanner.nextLine();
        String[] words=input.split(" ");
        if (words.length==3) 
        {
            String output=words[2] + " " + words[1] + " " +words[0];
            System.out.println("Output: " + output);
        }
        else 
        {
            System.out.println("Please enter exactly three words.");
        }
    }
}
