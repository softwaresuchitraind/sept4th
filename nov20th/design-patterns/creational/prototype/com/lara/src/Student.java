package com.lara;
public class  Student implements Cloneable
{
	private String firstName;
	private String lastName;
	private Integer age;
	public Student(String firstName, String lastName, Integer age)
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
		several members related to Student entity
	*/
	public Student getPrototype()
	{
		Student prototype = null;
		try
		{
			prototype = (Student) clone();
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		return prototype;
	}
}
