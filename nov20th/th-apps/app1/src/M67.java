//Differnce between creating in the 1st way and 2nd way.

class Employee
{
	//several members
}
class A extends Thread //can not extend employee
{
	
	//several attributes
	public void run()
	{
		//some task
	}
}

class B extends Employee implements Runnable
{
	//several attributes
	public void run()
	{
		//some task
	}
}
class M67 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.start();
		a2.start();
		a3.start();

		B b1 = new B();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Hello World!");
	}
}


/*

There are two ways of creating a Thread
1-By using Thread class
2-By using Runnable Interface

class A can not extend Employee,java does not support
extending multiple classes.

Even multiple Thread objects created less memory allocated
as Thread class containg only static members.
-We can achieve singleton design pattern----
---what single-ton design pattern says
using one object for all the threads using second approach.
designaing a class for one object is single-ton.


2nd way is more preferable than 1st ways
it is purely depending on the context-- if it is full of Threads
go for 1st way.

entity can be used as a Thread


2nd difference
-------------

*Thread class does not contain no non-static members
so it is loading one time only even we are creating
multiple Thread object.



*/