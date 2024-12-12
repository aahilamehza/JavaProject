package EXAMQUESTIONS;
import java.util.Scanner;

public class CharacterCount 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);   
        System.out.print("Enter a string:");
        String str=scanner.nextLine();
        int count=str.length();
        System.out.println("Total number of characters: " + count);
    }
}
