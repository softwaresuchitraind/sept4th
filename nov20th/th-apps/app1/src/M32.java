class A extends Thread 
{
	public void run()
	{
		for(int i=100;i<110;i++)
		{
			System.out.println("child begin");
			Util.sleep(30000);
			System.out.println("child end");
		}
	}
}
class M32
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		a1.start();
		Util.sleep(5000);
		a1.interrupt();
		
	}
}
/*
if any Thread is under sleep() u can interrupt.
after 5 seconds


- u can interrupt a Thread which is under sleep.

*/