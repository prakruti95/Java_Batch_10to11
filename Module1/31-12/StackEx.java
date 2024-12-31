package com.a3112;

import java.util.Stack;

public class StackEx 
{
	//push
	static void topspush(Stack<Integer> st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	
	//pop
	static void topspop(Stack<Integer>st)
	{
		Integer i = st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();
		
		//Entry
		topspush(st,10);
		topspush(st,20);
		topspush(st,30);
		topspush(st,40);
		
		//Exit
		
		try
		{
			topspop(st);
			topspop(st);
			topspop(st);
			topspop(st);
			topspop(st);
			topspop(st);
		}
		catch(Exception e)
		{
			System.out.println("No Data");
		}
		
		
		
	}
}
