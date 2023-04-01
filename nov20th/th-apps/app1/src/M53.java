class  A extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			System.out.println(getName() + "going to wait");
			try
			{
				wait();
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
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println(getName() + "going to wait");
			try
			{
				wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(getName() + "return from wait");
		}
	}
}
class M53
{

	public static void main(String[] args) 
	{
		
		A a1 = new A();
		B b1 = new B();
		a1.start();
		b1.start();
		Util.sleep(10000);
		System.out.println("after sleep");
		synchronized (a1)
		{
			a1.notify();
		}
		synchronized (b1)
		{
			b1.notify();
		}

	}
}


/*

we are releasing a1 and a2 by notify why we require 
shared class



Thread-0going to wait
Thread-1going to wait
after sleep
Thread-0return from wait
Thread-1return from wait
*/