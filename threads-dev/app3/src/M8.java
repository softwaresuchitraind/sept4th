class M8
 
{
	static Runnable getRunnable()
	{

		 return new Runnable()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		
		};
		
	}
	public static void main(String[] args) 
	{
		//no need of obj
		new Thread(getRunnable()).start();
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
