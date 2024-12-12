package EXAMQUESTIONS;
import java.util.Scanner;
public class OddAndEvenArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int s=scanner.nextInt();
        int[] n=new int[s];
        System.out.println("Enter elements of the array:");
        for (int i=0;i<s;i++) 
        {
            n[i]=scanner.nextInt();
        }
        
        System.out.println("Even numbers:");
        for (int i=0;i< n.length;i++)
        {
            int num=n[i];
            if (num%2==0)
            {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i=0;i<n.length;i++)
        {
        	int num=n[i];
            if (num%2!=0) 
            {
                System.out.print(num + " ");
            }
        }
    }
}
