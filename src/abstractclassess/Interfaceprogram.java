package abstractclassess;

interface cardetails
{
	public void acceleration();
    public void speedlimit();
    public void torque();
}

class Audi implements cardetails
{

	@Override
	public void acceleration() 
	{
		System.out.println("Audi acceleration");
		
	}

	@Override
	public void speedlimit()
	{
		
		System.out.println("Audi speedlimit");
	}

	@Override
	public void torque() 
	{
		System.out.println("Audi torque");
		
	}
	
}
public class Interfaceprogram 
{

	public static void main(String[] args) 
	{
		Audi ob=new Audi();
		ob.acceleration();
		ob.speedlimit();
		ob.torque();

	}

}
