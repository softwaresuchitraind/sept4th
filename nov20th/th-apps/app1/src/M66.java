class A extends Thread
{
	A(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	public void run()
	{
		for(int i=1;i <=100; i++)
		{
			System.out.println(getName() + ":" +i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		Thread t1 = Thread.currentThread();
		for(int i =1; i<=100;i++)
		{
			System.out.println(t1.getName() + ":" +i);
		}
	}
}
class M66 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("my first group");
		A a1 = new A(tg,"first thread");
		A a2 = new A(tg,"second thread");
		A a3 = new A(tg,"third thread");
		B b1 = new B();
		Thread t1 = new Thread(tg,b1);
		Thread t2 = new Thread(tg,b1);
		Thread t3 = new Thread(tg,b1);
		a1.start();
		a2.start();
		a3.start();
		t1.start();
		t2.start();
		t3.start();
		Util.sleep(1);
		tg.stop();//all six threads can be controlled
	}
}

/*

there are several methods of ThreadGroup,
Started group of threads can be controlled through groups.

ThreadPool is used for grouping in similar kind of 
Threads as one unit.

TreadGroup is a predefined class. It is used for grouping
multiple Threads into one group, we will be using
ThreadGroup.

-We can maintain all the Threads through a single command.

*/