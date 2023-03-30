class M15 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		};
		t1.run();
		for(int i=400;i<500;i++)
		{
			System.out.println(i);
		}
	}
}
/*
one child thread is created not started
*/