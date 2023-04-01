class A extends Thread
{
	public void run()
	{
		for(int i=0;i<200;i++)
		{
			System.out.println(i);
		}
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.start();
		for(int i=200;i<400;i++)
		{
			System.out.println(i);
		}
	}
}
/*
start() is responsible for
registering the thread schedular and allocating 
to execute run()
calling run()


thred schedular allocating time to main() thread and 
a1 thread
two threads are involved.

creating an object to A
while creating an object to A one thread is crated 
with default properties.

main thread is parent
a1 is child thread

child and main goes to thread schedular.
thread schedular allocates available cpu time to
main and also child.

no two outputs order will be same.

*/
