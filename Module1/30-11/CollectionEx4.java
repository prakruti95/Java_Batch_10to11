import java.util.ArrayList;
import java.util.Scanner;

public class CollectionEx4 
{
	public static void main(String[] args) 
	{
		//dynamic arraylist
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your Name");
//		String name = sc.next();
		
		
		ArrayList<String>arraylist = new ArrayList<>();
		
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");//e
		arraylist.add("d");
		
		arraylist.add(2, "e");//index method
		//arraylist.
		//arraylist.add(0, null);
		
		
		//a,b,e,c,d
		
		
		System.out.println(arraylist);
	}
}
