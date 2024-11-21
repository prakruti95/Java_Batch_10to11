package tops21;

import java.util.Scanner;

public class UserInputEx 
{
	//Scanner
	//how to create an object
	
	//classname objname = new classname();
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		
		System.out.println("\n Your id is: "+id+" \n Your Name is: "+name+"\n Your Salary is:  "+salary);
		
		System.out.println();
		//charAt()
		
		
		
	}
	
	
	
	

	
	
	
}
