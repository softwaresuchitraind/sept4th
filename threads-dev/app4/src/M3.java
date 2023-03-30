class M3
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(() ->
		{
			//run() body
			Thread obj=Thread.currentThread();
			System.out.println("run1:"+obj);
		});
		t1.start();

		Thread t2=new Thread(() ->
		{
			//run() body
			Thread obj=Thread.currentThread();
			System.out.println("run2:"+obj);
		});
		t2.start();

		Thread obj=Thread.currentThread();
		System.out.println("main:"+obj);
	}
}
/*
run1:Thread[Thread-0,5,main]
run2:Thread[Thread-1,5,main]
main:Thread[main,5,main]

main thread is parent to two child thread.
*/