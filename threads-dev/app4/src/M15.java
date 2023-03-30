class M15 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);//sleep() is a static method
				//sleep() argument is a long datatype.
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
		
	}
}
/*
whichever thread require to go for a sleep there we can go for sleep().
*/
