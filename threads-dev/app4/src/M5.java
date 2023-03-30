class M5 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
/*
1
main
5
false

Every thread is having 4 default properties

Id
Name
Priority
isDaemon

every thread is having a Id ,To read id we use getId();
once thread got created we can not mpdify threadId.
there is no method which can modify id of the thread.
Throughout the ife of the thread id is same.

To identify any thread to refer a thread from the group of thread we use id.
No two thread having same id.
to refer a thread uniquely from a group of threads ---getId.


name
....
The default name of the main Thread is main only.
If we consider child thread,child thread name will be 
thtead-0,
thread-1
thread-2
etc.

to use name of the thread use getName();

There are two ways to change default name of the thread.
1--Through setName method.
2--Through a Constructor.

Priority
--------
-Priority is a interger number between 1 to 10
-1 is a minimum priority]
-10 is a maximum priority
-5 is a normal priority.

*To read the priority we have to use getPriority()
*We can modify the default priority through setPriority() method.
*Default priority of     the main thread is 5.

*Default priority of any child Thread is its parent priority.---imp


Daemon
------
There are two types of Threads available

1---Daemon Thread
2---User Thread

*Daemon Thread---A thread which is always depends upon its parent thread life.
*User Thread---It is not depending on parent thread.
-User Thread continously executing without looking for its parent.
-No matter parent will continue or not user will execute.

isDaemon--- true--- it is a daemon thread
isDaemon---False---it is user Thread

-By default every child thread is a user thread.damenon is false.

There is a way of converting user into daemon by using setDaemon()

By using setDaemon() we can convert a user into Daemon(),it should be before start().

-main thread can not be converted into Daemon.as main thread already started.

-once thread


*/
