package com.a21;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int marks;
	String name;
	
	
	public Student(int marks,String name) 
	{
		this.marks=marks;
		this.name=name;
	}
	
	@Override
	public int compareTo(Student o) 
	{
		if(this.marks>o.marks)
		{
			return 1;
		}
		else if(this.marks<o.marks)
		{
			return -1;
		}
		else if(this.marks==o.marks)
		{
			return 0;
		}
			
		
		
		return 0;
	}
	
}


public class ComparableEx 
{
	public static void main(String[] args) 
	{
		
		Student s1 = new Student(56, "a");
		Student s2 = new Student(45, "a");
		Student s3 = new Student(78, "a");
		Student s4 = new Student(48, "a");
		Student s5 = new Student(56, "a");
		
		ArrayList<Student>arrayList = new ArrayList<>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		
		Collections.sort(arrayList);
		
		for(Student s : arrayList)
		{
			System.out.println(s.marks+" "+s.name);
		}
		
		
		
		
	}
}
