class A extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 200; i++)
		{
			System.out.println(i+ ":" +getName());
			yield();
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1; i <= 200; i++)
		{
			System.out.println(i + ":" +getName());
			yield();
		}
	}
}
class M63 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		
	}
}


/*
yield() method very frequently executes another Thread.
main functionality of yield() method is giving a functionality
to other thread.
enough use of cpu

yield() is a request not a command.

command means you sould
request means may or may not


-Giving chance to another Thread.
context switching-giving chance to another Thread before Thread shedular 
allocating time.

*/
