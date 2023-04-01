class A extends Thread 
{
	public void run()
	{
		for(int i=1; i<2000;i++)
		{
			System.out.println("child :" +i);
		}
	}
}
class M27
{
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		a1.start();
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
/*
3 variety of execution
a1.join---asking main thread to join after child thread
main thread has to wait till end of the cheld thread
u get sequential output here.
-parent has to join at the end of the child.
*/