class M11 
{
	static void produceThread(Runnable r1)
	{
		new Thread(r1).start();
	}
	public static void main(String[] args) 
	{
		Runnable r1=new Runnable()
		{
			public void run()
			{
				for(int i=1;i<1000;i++)
				{
					System.out.println("run:"+i);
				}
			}
		};
		produceThread(r1);
		for(int i=1000;i<2000;i++)
		{
			System.out.println("main:"+i);
		}
	}
}
