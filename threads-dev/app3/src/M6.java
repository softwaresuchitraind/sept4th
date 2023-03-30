class M6
 
{
	static Runnable getRunnable()
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
		return r1;
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
