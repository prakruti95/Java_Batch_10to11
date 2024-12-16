package tops1612;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("m called");
	}
}
class N extends M
{
	void n()
	{
		System.out.println("n called");
	}
}
class P extends N
{
	void p() throws IOException
	{
		System.out.println("p called");
	}
}

public class ThrowEx2 
{
	public static void main(String[] args) throws IOException
	{
		P p1 = new P();
		
		p1.m();
		p1.n();
		p1.p();
	}
}
