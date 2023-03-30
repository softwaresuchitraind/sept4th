class M7 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			new Thread()
			{
				public void run()
				{
					for(int i=1;i<1000;i++)
					{
						System.out.println(i);
					}
				}
			}.start();
		}
		for(int i=4000;i<5000;i++)
		{
			System.out.println(i);
		}
	}
}
/*
only one method needed to call so no reference variable is required.
*/