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
			W obj = new W();
		}
		catch ()
		{
		}
		System.out.println("main end");
	}
}
