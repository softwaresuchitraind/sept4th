package com.lara;
public class  Employee
{
	private String firstName;
	private String lastName;
	private Integer age;
	public Employee(String firstName, String lastName, Integer age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("First Name:" +firstName);
		sb.append("\tLast Name:" +lastName);
		sb.append("\tAge:" +age);
		return sb.toString();
	}
	/*
		several members related to Employee entity
	*/
	public Employee getPrototype()
	{
		Employee prototype = new Employee(firstName, lastName, age);
		return prototype;
	}
}
