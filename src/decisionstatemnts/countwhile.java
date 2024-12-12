//Program to print the count of number 5876 using while loop.

package decisionstatemnts;

public class countwhile 
{

	public static void main(String[] args)
	{
		int n=5876;
		int count=0;

		while(n>0)
		{
			n=n/10;  // 5876/10=587  //  587/10=58 //  58/10=5 // 5/10=0
			count++;     
		}

		System.out.println("Number of digits: " + count);
	}
}
