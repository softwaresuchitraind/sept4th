class M9
 
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
		Thread t1=getThread();
		t1.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
