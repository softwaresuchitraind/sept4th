class Shared
{
	 	
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
		synchronized(obj)
		{
			System.out.println(getName() + "going to wait");
			try
			{
				obj.wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(getName() +"return from wait" );
		}
	}
}
class B extends Thread
{
	Shared obj;
	B(Shared obj)
	{
		this.obj =obj;
	}
	public void run()
	{
		synchronized(obj)
		{
			System.out.println(getName() + "going to wait");
			try
			{
				obj.wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(getName() + "return from wait");
		}
	}
}
class M52
{

	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		A a1 = new A(s1);
		B b1 = new B(s1);
		a1.start();
		b1.start();
		Util.sleep(10000);
		System.out.println("after sleep");
		synchronized (s1)
		{
			s1.notifyAll();
		}

	}
}


/*
insted of synchronizing entire block wherever required we can use synchronized block
*/