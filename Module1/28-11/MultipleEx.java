package tops28;


interface B
{
	void b();
}
interface C 
{
	void c();
}

public class MultipleEx implements B , C 
{

	@Override
	public void c() 
	{
		
		System.out.println("c called");
	}

	@Override
	public void b() 
	{
		
		System.out.println("b called");
	}
	
	public static void main(String[] args) {
		
		
		MultipleEx m = new MultipleEx();
		
		
		m.b();
		m.c();
	}
}
