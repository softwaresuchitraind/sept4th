class M14 
{
	public static void main(String[] args) 
	{
		new Thread(
						() -> {
							for(int i=0;i<200;i++)
							{
								System.out.println(i);
							}
		
						}).start();
		
		for(int i=200;i<400;i++)
		{
		System.out.println(i);
		}
	}
}
