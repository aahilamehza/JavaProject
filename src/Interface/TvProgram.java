package Interface;

interface TVremote
{
	public void volume();
	public void responsetime();
	public void design();
}

interface SmartTvremote extends TVremote
{
	 public void internetConnectivity();
	 public void appSupport();
}

class TV implements SmartTvremote
{

	@Override
	public void volume()
	{
		System.out.println("TV Voume");
		
	}

	@Override
	public void responsetime() 
	{
		System.out.println("TV response time");
		
	}

	@Override
	public void design()
	{
		System.out.println("TV design");
		
	}

	@Override
	public void internetConnectivity() 
	{
		System.out.println("TV InternetConnectivity");
		
	}

	@Override
	public void appSupport()
	{
		System.out.println("TV appsupport");
	}
	
}
public class TvProgram
{

	public static void main(String[] args) 
	{
		TV ob= new TV();
		ob.volume();
		ob.responsetime();
		ob.design();
		ob.internetConnectivity();
		ob.appSupport();

	}

}

