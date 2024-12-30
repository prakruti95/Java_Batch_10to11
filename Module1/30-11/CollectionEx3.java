import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionEx3 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>personarrayList = new ArrayList<>();
		
		//add
		personarrayList.add("a");
		personarrayList.add("b");
		personarrayList.add("c");
		personarrayList.add("d");
		personarrayList.add("android");
		
		ArrayList<String>arrayList2 = new ArrayList<>();
		
		arrayList2.add("android");
		arrayList2.add("java");
		arrayList2.add("php");
		
		//personarrayList.addAll(arrayList2);
		//personarrayList.remove("d");//index,object
		//personarrayList.removeAll(arrayList2);
		
		//personarrayList.retainAll(arrayList2);
		
		
		Iterator i = personarrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}
}
