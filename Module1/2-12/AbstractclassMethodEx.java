package tops212;

class A1
{
	void a1()
	{
		System.out.println("A1 called");
	}
	
	//abstract void a2();
}
abstract class B1
{
	abstract void b1();
	
	void b2()
	{
		System.out.println("b2 called");
	}
}

public class AbstractclassMethodEx extends B1
{
	public static void main(String[] args) 
	{
		
		A1 a = new A1();
		a.a1();
		
		AbstractclassMethodEx a2 = new AbstractclassMethodEx();
		a2.b1();
		a2.b2();
	}

	@Override
	void b1() 
	{
		// TODO Auto-generated method stub
		System.out.println("b1 called");
	}

	
}
