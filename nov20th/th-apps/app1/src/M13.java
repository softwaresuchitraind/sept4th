class M13 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(
						() -> {
							for(int i=0;i<200;i++)
							{
								System.out.println(i);
							}
		
						});
		t1.start();
		for(int i=200;i<400;i++)
		{
		System.out.println(i);
		}
	}
}

//moaoroma 
//Gandharb