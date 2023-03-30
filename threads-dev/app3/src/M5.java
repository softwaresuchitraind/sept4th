class M5
 
{
	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		
		}).start();//t1 is not required as it required only once
		
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
		
	}
}
