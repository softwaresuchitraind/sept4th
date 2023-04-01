class A extends Thread 
{
	public void run()
	{
		
			System.out.println("child begin");
			Util.sleep(10000);
			System.out.println("child end");
		
	}
}
class M35
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.start();
		a1.start();
		System.out.println("main end");
		
	}
}
/*
IlligalThreadStateException
one thread should not be started seconed time.
starting same Thread second time is abnormal condition.
Main thread only terminates
no body is therd to handle

-Same Thread should not be started more than once 
it is a abnormal condition.
-Thread schedular wont allowing duplicate 
Thread registration.



G:\nov20th\th-apps\app1\src>java -cp ../classes M35
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.start(Thread.java:708)
        at M35.main(M35.java:18)
child begin
child end

*/