package com.lara;
class M1 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("vijay", "manu", 22);
		Employee prototype1 = employee.getPrototype();
		Employee prototype2 = employee.getPrototype();
		Employee prototype3 = employee.getPrototype();
		System.out.println("employee :" +employee);
		System.out.println("prototype1: " +prototype1);
		System.out.println("prototype2: " +prototype2);
		System.out.println("prototype3:" +prototype3);
		System.out.println(employee == prototype1);
		System.out.println(employee == prototype2);
		System.out.println(prototype1 == prototype2);
	}
}
