package Newjava;

import java.util.Scanner;

public class sumandaverge 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[3];
		int sum=0;
		double avg=0;
		System.out.println("Enter the numbers:");

		for(int i=0; i<=2; i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Entered numbers are:");
        for (int i = 0; i<=2; i++) 
        {
            System.out.println(arr[i]);
        }	
        
        sum=arr[0]+arr[1]+arr[2];
        System.out.println("The sum of the numbers:" +sum);
        
        
        avg=(double)sum/arr.length;
        System.out.println("The average of the numbers:" +avg);

	}

}


// Scanner sc= new Scanner(System.in);
// System.out.println("Enter the array size:");
// int arraysize=sc.nextInt();
// int sum=0;
//
// System.out.println("Enter the numbers:");
// int[] arr=new int[arraysize];
// for(int i=0;i<arraysize;i++)
// {
//    arr[i]=sc.nextInt();
//    sum=sum+arr[i];
// }
//  System.out.println("The average of the numbers:" +sum);
//  System.out.println("The average of the numbers:" +sum/arraysize);
//}
//}