package decisionstatemnts;
import java.util.Scanner;

public class newprogram {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        for (int i=n;i>=1;i--) 
        {
            for (int j=1;j<=i;j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }     
    }
}
