package tops1612;

import java.util.ArrayList;

public class ArrayEx3 
{
	public static void main(String[] args) 
	{
		
			int marks[][] = 
				{
						{1,2,3},
						{4,5,6},
						{7,8,9}
				};
			
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
					System.out.println("Value of ["+i+"] ["+j+"] = "+marks[i][j]);
				}
				System.out.println();
			}
			
		
	}
}
