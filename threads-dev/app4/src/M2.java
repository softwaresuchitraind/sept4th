class M2 
{
	public static void main(String[] args) 
	{
		//main thread is creating an object to Thread class
		Thread t1=new Thread(() ->
		{
			//executed by child
			Thread obj=Thread.currentThread();
			System.out.println("run:"+obj);
		});
		t1.start();//child thread is continue
		Thread obj=Thread.currentThread();
		System.out.println("main:"+obj);
	}
}
/*
main:Thread[main,5,main]
run:Thread[Thread-0,5,main]
Thread-0 ---Name of the child thread
*/