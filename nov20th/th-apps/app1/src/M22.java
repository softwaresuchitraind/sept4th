class A extends Thread 
{
	public void run()
	{
		System.out.println("from child");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("priority: "+getPriority());
		System.out.println("Daemon: "+isDaemon());
	}
}
class M22
{
	public static void main(String[] args) 
	{
		//Before starting child thread we change parent thread priority.
		Thread.currentThread().setPriority(10);
		A a1 = new A();
		a1.start();
	}
}
/*

from child
id: 9
name: Thread-0
priority: 10
Daemon: false

same parent Thread priority copied to child -10


Chield Thread defaut priority is its parent priority.


*/