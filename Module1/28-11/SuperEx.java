package tops28;

class A2
{
	String color="black";
}
class B2 extends A2
{
	String color="white";
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		B2 b = new B2();
		b.display();
	}
}
