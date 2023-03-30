class M7
 
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
		Runnable obj=getRunnable();
		new Thread(obj).start();
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
