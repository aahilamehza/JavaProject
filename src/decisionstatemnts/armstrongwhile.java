//Check whether the number 153 is armstrong or not using while.
// 1*1*1+5*5*5+3*3*3=1+125+27=153

package decisionstatemnts;

public class armstrongwhile 
{
	public static void main(String[] args)
	{
		int n=153;
		int a=n;       // a= original number
		int r;         // remainder
		int res=0;     // result
		
		while(n!=0)
		{
			r=n%10;    // 153%10=3;   15%10=5;   1%10=1
			res+=r*r*r;// 3*3*3=27;   5*5*5=125; 1*1*1=1
			n=n/10;    // 153/10=15;  15/10=1;   1/10=0
		}

		if (res==a)
		{
			System.out.println(a+ " is an Armstrong number.");
		}
		else
		{
			System.out.println(a+ " is not an Armstrong number.");
		}
	}
}
