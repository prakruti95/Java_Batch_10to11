package com.model;

public class Person {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void myinit()
{
	System.out.println("Init method called");
}
public void mydest()
{
	System.out.println("destroy method called");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
