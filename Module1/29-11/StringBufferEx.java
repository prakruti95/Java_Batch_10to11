package tops2911;

//Mutable
public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		
		StringBuffer sf = new StringBuffer("Hello");
		
		//sf.append(" Java");
		//sf.insert(1,"Java");
		//sf.delete(1,3);
		//sf.replace(1, 3,"Java");
		sf.reverse();
		System.out.println(sf);
		
	}
}
