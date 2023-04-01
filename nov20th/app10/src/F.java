class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		do
		{
			
			System.out.println("loop body begin:"+i);
			if(i>=5)
			{
				continue;//ignore the remaining statement go to boolena condition
			}
			System.out.println("loop body end:"+i);
		
		}
		while (i++<=10);
		System.out.println("main end");
	}
}