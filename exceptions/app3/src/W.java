class W
{
	W()throws ClassNotFoundException
	{
		System.out.println("W()");
	}
	public static void main(String[] args)
	{

			System.out.println("main begin");
			try
			{
				V v1= new V();
			}
			catch (ClassNotFoundException ex)
			{

			}
			
			System.out.println("main end");	
	}
	
}

