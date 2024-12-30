import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx2 
{
	public static void main(String[] args) 
	{
		//int arr[] = new int[5];
		
		ArrayList<String> arraylist = new ArrayList();
		
		arraylist.add("Java");
		arraylist.add("Kotlin");
		arraylist.add("Dart");
//		arraylist.add(25);
//		arraylist.add(50.60);
//		arraylist.add('T');
//		
		//System.out.println(arraylist);
		
		Iterator i = arraylist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
