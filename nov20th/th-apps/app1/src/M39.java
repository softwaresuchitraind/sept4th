class Shared
{
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		for(int i=0; i<200; i++)
		{
			System.out.println("test:" +i+ ":" +t1.getName());
		}
	}
	synchronized void test2()
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
		s1.test1();
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
		s1.test2();
	}
}
class M39
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
-if one object is there we are used symultaneously.
-Sysnchornisation is object wise.
-more tan one object can not enter into same class.
-Synchronization is not method wise,it is object wise.
-if object is same u will get sequential only.


*differnt objects----different object logs-----simultaneous output.


*/