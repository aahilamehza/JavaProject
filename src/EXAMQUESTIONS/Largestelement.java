package EXAMQUESTIONS;
import java.util.Scanner;

public class Largestelement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=scanner.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++) 
        {
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        for (int i=1;i<n;i++) 
        {
            if (array[i] > largest) 
            {
                largest=array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}