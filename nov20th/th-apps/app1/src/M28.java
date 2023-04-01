class A extends Thread 
{
	public void run()
	{
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
class M28
{
	public static void main(String[] args) 
	{
		
		A a1 = new A();
		a1.start();
		
		System.out.println("main end");
	}
}


/*
join,sleep,wait()--------------interrupted Exception---- Checked Exception
Among these three methods sleep() is a static method.
Sleep method argument is a long data type.
long number repersents miiliseconds
*/