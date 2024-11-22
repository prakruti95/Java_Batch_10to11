package tops22;

public class CopyConEx 
{
	String name;
	
	CopyConEx(String name) 
	{
		this.name=name;
	}
	CopyConEx(CopyConEx c) 
	{
		System.out.println(c.name);
	}
	
	public static void main(String[] args) 
	{
		CopyConEx c1 = new CopyConEx("krunal");
		CopyConEx c2 = new CopyConEx(c1);
	}
}
