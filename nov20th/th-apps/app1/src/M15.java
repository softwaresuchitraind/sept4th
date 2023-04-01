class M15 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println("id:"+t1.getId());
		System.out.println("name:"+t1.getName());
		System.out.println("daemon:"+t1.isDaemon());
		System.out.println("priority:"+t1.getPriority());
	}
}
/*

id:1
name:main
daemon:false
priority:5
-for every thread there are default properties.
-this is read by getter methods.

find out main Thread properties.

Id is a long number which is unique.
Every thread is having one unique id.
-Two threads will not having same id.
-There is no way of chaing id of a Thread/modify id of a Thread.
-We can read the id by using getId().
-name is String--Thread-0,Thread-1,main----is the default name
We can read name of a Thread by using getName(),
We can change the default name in two different ways.
1-Through SetName()
2-through a constructor


daemon status
--------------
-It is depend on parent.When parent is leaving it is leavin.


-Every chield Thread and even main Thread is a User Thread.
Daemon status is false i.e user Thread.
isDaemon() return type is boolean.

-We can read the daemon status through isDaemon(),

-We can make user thread into darmon thread by calling setDaemoon()
We can set the Daemon status through setDaemon(),

*Before starting only we can convert Thread into Daemon.

-setDaemon() should be called before start.

priority
------------
priority() is a integer number between 1 to 10.
1-minimum priority
10 -maximum priority
5 - Normal priority

- We can set a priority through setPriority(),
main Thread default priority is normal priority i.e 5.

We can change the priority of Thread.

Default priority of chield Thread is a parent priority.

-Thread shedular gives more pripority to highest priority
Thread.

-We can modify the priority by using setPriority(int)

Difference between request and command
-------------------------------------------
-command means guarented to execute
-request means may or may not.
-may not be immidiately or after some time.





























*/