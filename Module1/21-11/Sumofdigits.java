package tops21;

import java.util.Scanner;

public class Sumofdigits 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;//4
		int rem=0;
		
		while(num>0)
		{
			rem = num%10;//4
			sum+=rem;//sum=sum+rem=0+4=4
			num=num/10;
		}
		System.out.println("Sum of all digits is :"+sum);
		
	}
}
