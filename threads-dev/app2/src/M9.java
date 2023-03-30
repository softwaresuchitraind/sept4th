class M9 
{
	static Thread getThread()
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
			return t1;
		
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			getThread().start();
		}
	
		for(int i=4000;i<5000;i++)
		{
			System.out.println(i);
		}
	}
}
/*

*/