//Program to reverse number 256 using while loop.

package decisionstatemnts;
public class reversewhileloop 
{
	public static void main(String[] args) 
	{
		int n=256;
		int remainder;
		int reverse=0;
		while(n>0)
		{
			remainder=n%10;                // 256%10= 6 ;  25%10=5;   2%10=2
			reverse=reverse*10+remainder;  // 0*10+6= 6 ;  6*10+5=65; 65*10+2=652
			n=n/10;                        // 256/10= 25;  25/10=2;   2/10=0
		}
		 System.out.println("Reversed number: " + reverse);
	}
}

