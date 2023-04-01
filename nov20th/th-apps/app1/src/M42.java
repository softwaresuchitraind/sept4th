class Shared
{
	 void test1()
	{
		System.out.println("test1 begin");
		synchronized (this)
		{
			int i;
			Thread t1 = Thread.currentThread();
			for( i=0; i<200; i++);
			{
				System.out.println("test1:" + i + ":" +t1.getName());
			}
		}
		System.out.println("Test1 end");
	}

	 void test2()
	{
		System.out.println("test2 begin");
		synchronized (this)//mutex
		{
			Thread t1 = Thread.currentThread();
			for(int i=0; i<200; i++)
			{
				System.out.println("test2:" +i+ ":" +t1.getName());
			}
		}
		System.out.println("Test2 end");

		
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
class M42
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

Simultaneous ...........




*/