package tops1312;

public class GcEx 
{
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Garbage Collection Called");
	}
	
	public static void main(String[] args) 
	{
		GcEx g1 = new GcEx();
		GcEx g2 = new GcEx();
		GcEx g3 = new GcEx();
		
		
		g1 = null;
		g2 = null;
		g3 = null;
//		
//		System.out.println(g1);
//		System.out.println(g2);
//		System.out.println(g3);
		
		System.gc();
	}
}
