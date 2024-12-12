package Exception;

public class Exceptionnew 
{
	public static void main(String[] args)
	{
		try
		{
		  int c=5/0;
		  System.out.println(c);
		  System.out.println("Hello");
		}
        catch(Exception e)
		{
        	  System.out.println(e.getMessage());           //ArithmetciException
		}
		
		System.out.println("Hello");
		
		try
		{
			String s=null;
			System.out.println(s.length());                 // NullPointerException
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
		
		try
		{
			int ar[]=new int[2];
			ar[0]=1;
			ar[1]=4;
			ar[2]=6;
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());            //ArrayOutOfBound Exception
		}
	}

}
