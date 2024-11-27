package tops26;

class A
{
	void a()
	{
		System.out.println("A called");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("b called");
	}
}


public class SingleEx 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		
		 b1.b(); 
		 b1.a();
		 
		
//		A a1 =  new A();
//		a1.a();
//		a1.b();
	}
}
