package abstractclassess;

abstract class cars
{
	abstract public void acceleration();
	public void carengine()
	{
		System.out.println("Engine Details:");
	}
}

class kia extends cars
{
	@Override
	public void acceleration()
	{
		System.out.println("Kia acceleration");
	}

}

class maruti extends cars
{
	@Override
	public void acceleration()
	{
		System.out.println("maruti acceleration");
	}

}

public class abstractcars
{

	public static void main(String[] args)
	{
		kia ob=new kia();
		ob.acceleration();
		ob.carengine();
		maruti ob1=new maruti();
		ob1.acceleration();
		ob1.carengine();

	}

}
