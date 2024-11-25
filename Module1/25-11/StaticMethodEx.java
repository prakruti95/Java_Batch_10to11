package tops25;

public class StaticMethodEx 
{
	int id;
	String name;
	static String college="VVP";
	
	public StaticMethodEx(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="XYZ";
	}
	
	public static void main(String[] args) 
	{
		
		StaticMethodEx s1 = new StaticMethodEx(101,"a");
		StaticMethodEx s2 = new StaticMethodEx(102,"b");
		
		change();
		
		s1.display();
		s2.display();
		
	}
}
