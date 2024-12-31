package com.a3112;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx 
{
	public static void main(String[] args) 
	{
		
		//HashSet,LinkedHashSet,Treeset
		
		HashSet<String>set = new HashSet<String>();
		set.add("d");
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("a");
		
		System.out.println(set);
		
		HashSet<Integer>set2 = new HashSet<Integer>();
		set2.add(5);
		set2.add(2);
		set2.add(3);
		set2.add(1);
		set2.add(5);
		set2.add(2);
		
		System.out.println(set2);
		
		HashSet<String>set3 = new HashSet<String>();
		set3.add("Vijay");
		set3.add("Ajay");
		set3.add("Rahul");
		set3.add("Vivek");
		set3.add("Bhargav");
		set3.add("Harsh");
		set3.add("Naman");
		set3.add("Vivek");
		System.out.println(set3);
		
		
	}
}
