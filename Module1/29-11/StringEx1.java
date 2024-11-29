package tops2911;

public class StringEx1 
{
	public static void main(String[] args) 
	{
		
		String s1 = "tops"; //literal String
		
		String s2 = new String("tops");//Object String
		
		char ch[]= {'t','o','p','s'};//character array String
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
