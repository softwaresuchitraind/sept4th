class A extends Thread 
{
	public void run()
	{
		
			System.out.println("child begin");
			int i= 10/0;
			System.out.println("child end");
		
	}
}
class M33
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.start();
		Util.sleep(5000);
		a1.interrupt();
		System.out.println("main end");
		
	}
}
/*

child begin
Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
        at A.run(M33.java:7)
main end

-Exception occurs in which Thread that thread is terminating
other thread continue.
main thread is not affecting.


if exception object is in chield thread then chiled
Thread is responsible 
to handle.
if not handled Child Thread is terminating.

-in whichever thread exception occuring only that 
Thread affected.


Exception Object is a Threadwise.

*/