package tops212;

public class OverloadingEx 
{
	static int cal(int a,int b)
	{
		return a+b;
	}
	static double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(cal(6,5));
		System.out.println(cal(2.0,3.0));
	}
}
