class M10
 
{
	static Thread getThread()
	{

		 return new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		
		});
		
	}
	public static void main(String[] args) 
	{
		getThread().start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
