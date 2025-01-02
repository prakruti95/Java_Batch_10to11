package com.a21;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("sapna",1);
		map.put("krunal",2);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		
		
		
		
		//System.out.println(map.get("tops1"));
		
		
		
	}
}
