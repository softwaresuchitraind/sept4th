 class M16
{
	public static void main(String[] args) 
	{
		new Thread()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		}.run();
		for(int i=400;i<500;i++)
		{
			System.out.println(i);
		}
	}
}

/*
child thread is created but not started..main method is calling thread only.
sequentially for loop is developed.

*/