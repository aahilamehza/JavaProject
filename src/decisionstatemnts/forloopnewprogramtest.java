package decisionstatemnts;
import java.util.Scanner;

public class forloopnewprogramtest 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++) 
        {
             for(int j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
