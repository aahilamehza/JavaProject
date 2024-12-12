package inheritance;

class car
{
	public void displaymethod()
	{
		System.out.println("Display the care details:");
	}
}

class bmw extends car
{
	public void bmwdetails()
	{
		System.out.println("bmw details:");
	}
}

public class singleinheritance 
{
	public static void main(String[] args) 
	{
		bmw ob= new bmw();
		ob.displaymethod();  //parent class of method
		ob.bmwdetails();     //child class of method.
	}

}
