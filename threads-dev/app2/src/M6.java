class M6 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
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
			t1.start();
		}
		for(int i=4000;i<5000;i++)
		{
			System.out.println(i);
		}
	}
}
/*
4 threads
*/