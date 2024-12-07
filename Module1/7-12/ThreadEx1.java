package tops712;

class A extends Thread
{
	@Override
	public void run() 
	{
		super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
	}
}

class B extends Thread
{
	@Override
	public void run() 
	{
		super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}

public class ThreadEx1 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
		
		//a.run();
		//b.run();
		
	}
	
}
