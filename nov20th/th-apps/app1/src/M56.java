//whenever Thread is joining Object log is releasing or not
class A extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		Util.sleep(3000);
		synchronized(this)
		{
			System.out.println("child in synchronized block");
		}
		System.out.println("run end");
	}
}
class M56 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		Util.sleep(1000);
		synchronized(a1)
		{
			try
			{
				a1.join();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("main end");
		}
	}
}


/*


Wait() and join() releasing object log

sleep() is not releasing the object log.


if log is not releasing then dead lock situation occurs.

run begin
child in synchronized block
run end
main end

*/
