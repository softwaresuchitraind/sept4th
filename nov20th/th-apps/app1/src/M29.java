class A extends Thread 
{
	public void run()
	{
		for(int i=100; i<110;i++)
		{
			System.out.println(i);
			try
			{
				sleep(3000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
class M29
{
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		a1.start();
		for(int i=1; i<10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}


/*
join,sleep,wait()--------------interrupted Exception-
--- Checked Exception
main thread is sleep for 1000ms
cheld thread can call sleep()straight way as 
it is subclass to Thread.
*/