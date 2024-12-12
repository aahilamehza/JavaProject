package method;

public class Newprogram 
{

	public static void main(String[] args)
	{
		// method
		Newprogram ob= new Newprogram();
		ob.add();                       //frst
		System.out.println(ob.sub());   //sec
		ob.mul(5,25);                  //third
		System.out.println(ob.div(50, 10));
		

	}
	//method without return type and without parameter add()
	public void add()
	{
		int a=10, b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	//method with return type and without parameters sub()
	public int sub()
	{
		int a=10, b=20,c;
		c=a-b;
		return c;
	}
	
	//method without return type and with parameters mul()
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	//method with return type and with parameters ()
		public double div(int a, int b)
		{
			double d= a/b;
			return d;
		}
		
} 
