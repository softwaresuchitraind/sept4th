class M4
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(() ->
		{
			
			Thread obj=Thread.currentThread();
			System.out.println("run1:"+obj);
			
			Thread t2=new Thread(() ->
			{
			
				Thread obj1=Thread.currentThread();
				System.out.println("run2:"+obj1);
			});
		t2.start();
		});
		t1.start();

		Thread obj=Thread.currentThread();
		System.out.println("main:"+obj);
	}
}
/*

main:Thread[main,5,main]
run1:Thread[Thread-0,5,main]
run2:Thread[Thread-1,5,main]

t1 is child to main(),t2 is child to t1

*/