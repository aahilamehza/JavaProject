package decisionstatemnts;

public class factorialsimpleloop 
{

	public static void main(String[] args) 
	{
		int f= 1;
		for (int i = 1; i <= 5; i++) 
		{
			f=f*i; //f=1*1=1(f=1, i=1 {{{1 that is 1 less than equal to 5}}}  true)  1*2=2(f=1, i=2 true)  2*3=6(f=2, i=3 true )  6*4=24(f=6, i=4 t)  24*5=120. 
		}
		 System.out.println("value of 5!= " +f);
	 }
}
