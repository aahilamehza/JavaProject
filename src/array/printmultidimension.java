package array;

import java.util.Scanner;

public class printmultidimension 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[2][3];
		System.out.println("Enter the numbers:");
		
        for(int i=0;i<2;i++) 
        {
            for(int j=0;j<3;j++) 
            {
                System.out.print("Enter element for position [" + i + "][" + j + "]: ");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(" The two dimesnional array is:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
		
