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
		
	}
}
/*
cs
java.lang.ClassNotFoundException:
in one try any number of class.forname() statements  not required multiple catch.

*/