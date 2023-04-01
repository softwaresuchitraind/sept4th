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
class M21
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
	}
}
/*

from child
id: 9
name: Thread-0
priority: 5
Daemon: false



Id
----
Id is a randon number

-every thread having 4 default properties.
-every thread having unique id.
-id of the Thread is a long number.
-we can read id of the Thread through getId()
-There is no method to modify the ID.
-No two threads will have same ID.
-Default naming convention to any chield thread
thread-0
thread-1
thread-2
.......
-There are two ways to change the default Thread name
-through setName()
-through constructor

priority
----------
-priority is a integer number between 1 to 10.
-Default priority of the main thread is NORMPRIORITY.
-Default priority of any child Thread is its parent 
priority.

Daemon
----------
-In java every child thread is user Thread by default.
-Daemon status can be changed before starting a child 
Thread.
-To change the child Thread use setDaemon().

*/
