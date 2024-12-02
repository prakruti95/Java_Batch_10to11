package tops212;

class RBI
{
	int roi()
	{
		return 0;
	}
}

class SBI extends RBI
{
	int roi()
	{
		return 7;
	}
}

class ICICI extends RBI
{
	int roi()
	{
		return 8;
	}
}


class AXIS extends RBI
{
	int roi()
	{
		return 9;
	}
}



public class OverridingEx 
{
	public static void main(String[] args) 
	{
		RBI r;
		
		r = new SBI();
		System.out.println(r.roi());
		
		r = new ICICI();
		System.out.println(r.roi());
		
		r = new AXIS();
		System.out.println(r.roi());
		
	}
}
