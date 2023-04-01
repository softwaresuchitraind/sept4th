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
class M38
{

	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s2);
		a1.start();
		b1.start();

	}
}
/*
do not use static members inside nonstatic synchonized method


Even trough synchronized we get symultaneous output.different object log
chances are there for data corruption.

static will be corrupted --non static wil not be corrupted.

-Synchronization is object wise

-in one object two threads should not enter we use synchonizrd.here two objects


*/