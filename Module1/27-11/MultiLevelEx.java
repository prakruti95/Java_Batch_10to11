package tops26;

class A1
{
	void a()
	{
		System.out.println("A called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("b called");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("c called");
	}
}


public class MultiLevelEx 
{
	public static void main(String[] args) 
	{
			C1 c = new C1();
			
			c.a();
			c.b();
			c.c1();
	}
}
