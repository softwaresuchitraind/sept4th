class P
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			System.out.println("done");
			
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end");
	}
}

/*
cs/Rs

one catch is sufficient to handle any number of exception
*/
