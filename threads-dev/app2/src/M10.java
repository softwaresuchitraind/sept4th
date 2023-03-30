class M10 
{
	static Thread getThread()
	{
		return new Thread()//Anonymous inner class,creating object,returning object
			{
				public void run()
				{
					for(int i=1;i<1000;i++)
					{
						System.out.println(i);
					}
				}
			};
			
		
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