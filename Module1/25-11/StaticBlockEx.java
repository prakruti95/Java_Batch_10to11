package tops25;

public class StaticBlockEx 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
	
	//static block will always executed before main method
	static
	{
		System.out.println("Hii");
	}
	
}
