package tops22;

public class Student 
{
	//data memebers or variables
	int id;
	String name;
	
	public static void main(String[] args) 
	{
			
		//creating an object
		Student s1 = new Student();
		Student s2 = new Student();
		
		//assigning the value
		s1.id=101;
		s1.name="krunal";
		
		s2.id=102;
		s2.name="sapna";
		
		//print
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
		//System.out.println(Object.);
	}
}
