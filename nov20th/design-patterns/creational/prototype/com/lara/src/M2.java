package com.lara;
class M2 
{
	public static void main(String[] args) 
	{
		Student student= new Employee("vijay", "manu", 22);
		Student prototype1 = employee.getPrototype();
		Student prototype2 = employee.getPrototype();
		Student prototype3 = employee.getPrototype();
		System.out.println("Student:" +employee);
		System.out.println("prototype1: " +prototype1);
		System.out.println("prototype2: " +prototype2);
		System.out.println("prototype3:" +prototype3);
		System.out.println(student == prototype1);
		System.out.println(student == prototype2);
		System.out.println(prototype1 == prototype2);
	}
}

/*
Object class clone method exclusively introduced for prototype design pattern
*/
