class M16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1=new Thread(
			()->{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child:"+ i);
			try
			{
				Thread.sleep(1000);
				
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		});

		t1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main:"+ i);
			try
			{
				Thread.sleep(1000);
				
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

*/