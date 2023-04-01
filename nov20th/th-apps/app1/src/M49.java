class Shared
{
	 synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by:" +t1.getName());
		try
		{
			wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Test1 end by :"+t1.getName());
	}

	synchronized void test2()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by: "+t1.getName());
		notifyAll();// both the Threads releasing
		System.out.println("test2 end by: "+t1.getName());

		
	}
}
class  A extends Thread
{
	Shared obj;
	A(Shared obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class B extends Thread
{
	Shared obj;
	B(Shared obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class M49
{

	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s1);
		a1.start();
		b1.start();
		Util.sleep(10000);
		System.out.println("after sleep");
		s2.test2();

	}
}

/*

both the threads waiting s1.wait()
but main thread calling s2.wait();



InterThread communicatuion is objectwise.
*/