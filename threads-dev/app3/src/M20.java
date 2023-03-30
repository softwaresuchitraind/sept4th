class M20
{
	public static void main(String[] args) 
	{
		
		Thread t1=new Thread(()->
		{
	
			for(int i=1000;i<2000;i++)
			{
				System.out.println("run:"+i);
			}
		});
		t1.start();
			for(int i=1000;i<2000;i++)
			{
				System.out.println("run:"+i);
			}
		System.out.println("done");
	}
}

/*

*/