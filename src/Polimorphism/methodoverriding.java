package Polimorphism;

class Parent
{
    public void job() 
    {
        System.out.println("Engineer");
    }

    public void phone() 
    {
        System.out.println("Samsung");
    }
}

class Child extends Parent 
{

	@Override
	public void job() 
	{
		System.out.println("Doctor");
		super.job();
	}

	@Override
	public void phone() 
	{
		System.out.println("Nokia");
		super.phone();
	}
	
}

public class methodoverriding
{
	public static void main(String[] args) 
	{
		Child ob= new Child();
		ob.job();
		ob.phone();
	}
}