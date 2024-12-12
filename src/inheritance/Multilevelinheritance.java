package inheritance;

class Bird
{
	public void BirdMethod()
	{
		System.out.println("the bird details");
	}
}

class Hen extends Bird
{
	public void HenDetails()
	{
		System.out.println("The Hen details");
	}
}

class Chicken extends Hen
{
	public void ChickenDetails()
	{
		System.out.println("The Chicken details");
	}
}

public class Multilevelinheritance 
{
	public static void main(String[] args)
	{
		Chicken ob= new Chicken();
		ob.BirdMethod();
		ob.HenDetails();
		ob.ChickenDetails();
	}

}
