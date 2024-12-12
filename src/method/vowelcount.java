package method;
import java.util.Scanner;
public class vowelcount 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        vowelcount v = new vowelcount();
        int count = v.vowelcount(s);
        System.out.println("Count of vowels in the word: " + count);   
        sc.close();
    }    
    public int vowelcount(String s) 
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
            {
                count++;
            }
        }
        return count;
    }
}

    	
