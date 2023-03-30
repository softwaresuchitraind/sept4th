  class M12
{
	static void test(Thread t1)
	{
		t1.start();
	}
	public static void main(String[] args) 
	{
		// Designing a subclass to thread,overiding thread,creating object and passing reference to test()
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
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println(i);
		}
	}
}
/*

*/