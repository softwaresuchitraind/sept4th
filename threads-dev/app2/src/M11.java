class M11 
{
	static void test(Thread t1)
	{
		t1.start();
	}
	public static void main(String[] args) 
	{
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		};
		test(t1);//we are supplying thread reference to test(),test() is calling
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
/*
2 threads
*/