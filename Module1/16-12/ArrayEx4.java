package tops1612;

import java.util.ArrayList;

public class ArrayEx4 
{
	public static void main(String[] args) 
	{
		
		int A[] =  {10,20,30,40,50,60,70};
		
		int B[] = new int[10];
		
		
		System.arraycopy(A, 2, B, 2, 3);
		
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		
		
		
		
		
		
		
		
	}
}
