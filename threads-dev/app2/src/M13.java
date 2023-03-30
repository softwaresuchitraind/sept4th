class M13
{
	static void test(Thread t1)
	{
		t1.start();
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
		test(new Thread()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		});

		}
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
/*

*/