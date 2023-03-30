class M4
 
{
	public static void main(String[] args) 
	{
		//wherever u r calling there u can supply Runnable()
		Thread t1=new Thread(new Runnable()
		{
			//through a constructor we r supplying an object to subclass to Runnable
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		
		});
		t1.start();
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
