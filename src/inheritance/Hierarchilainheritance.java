package inheritance;

class Animal
{
	public void animalmethod()
	{
		System.out.println(" The animal details are:");
	}
}

class Tiger extends Animal
{
	public void Tigermethod()
	{
		System.out.println("The Tiger details:");
	}
}

class Deer extends Animal
{
	public void Deermethod()
	{
		System.out.println("The deer details.");
	}
}

public class Hierarchilainheritance 
{
	public static void main(String[] args)
	{
		Tiger ob= new Tiger();
		Deer ob1=new Deer();
		ob.animalmethod();
		ob.Tigermethod();
		ob1.animalmethod();
		ob1.Deermethod();
		

	}

}
