class Shared
{
	synchronized void test()
	{
		Thread t1 = Thread.currentThread();
		for(int i=0; i<200; i++)
		{
			System.out.println("test:" +i+ ":" +t1.getName());
		}
	}
}
class  A extends Thread
{
	Shared s1;
	A(Shared s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		s1.test();
	}
}
class B extends Thread
{
	Shared s1;
	B(Shared s1)
	{
		this.s1 =s1;
	}
	public void run()
	{
		s1.test();
	}
}
class M37
{

	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s1);
		a1.start();
		b1.start();
		s1.test();

	}
}
/*
both the threads are executing test() simultaniously
once 1st one is complectly got over second one is started
this is called Synchronization--if u want to execute only one thread at a time
-Synchronized keyword can be used in two different ways

1-method making as a synchronized
2-block making as a synchonized.

-While creating an object to Shared classs one object log will be created.
-while creating an object to any class one object log is creating.
-whenever u create an object to any class object log is creating.
-for every object one object log is created.
-Whenever Thread is calling Synchronized method Object log is created.
-Thread can not create to Synchronized method.


-every object is having one object lock.
-while creating an object to any class one object lock is created.
- Thread can not enter synchonized method--closed method-Thread can not enter into
synchronized method by default.
- to enter into synchronized method it require object lock.every object is having one object lock.
multiple objects can not enter into object lock simultaniously.





-If any method is declared as synchonized this is closed method
to a Thread.

-Thead can not enter into Synchonized method straight way.
It require object log to enter into synchonized method.
-Every object will have one object log.


*/