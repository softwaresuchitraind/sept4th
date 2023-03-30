class M14
{
	public static void main(String[] args) 
	{
		Runnable r1=() -> {

			for(int i=1;i<1000;i++)
			{
				System.out.println("run:"+i);
			}
		};

		Thread t1=new Thread(r1);
		t1.start();
		try
		{
			t1.join();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
We are asking to the parent we had to wait till parent execution got over.
once t1 complectly got over main executr
main has to join after t1.

there are 3 methods which require interuptedException
1---Join()
2--sleep()
3--wait()
*/