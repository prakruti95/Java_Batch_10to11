package tops1312;


enum Student 
{
		John(11), Bella(10), Sam(13), Viraaj(9);
	
		private int age;
		
		int getAge()
		{
			return age;
		}
		
		private Student(int age) {
			this.age= age;
		}
}
public class EnumEx
{
	public static void main(String[] args) 
	{
		System.out.println("Age of Viraaj Sis " +Student.Viraaj.getAge()+ " years");
	}
}
