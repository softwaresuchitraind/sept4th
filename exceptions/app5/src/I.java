class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try(H h1=new H())//h1 can be used in try we can not reinitialize as it is final
		{
			System.out.println("from try");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*
in jdk 1.7 interduces
the resources of closable type.

once try got over close() is calling from H1
Autoresource---we dont require to call h1.close().

* If u r using autoresource closing we do not require finally block at all.
Database and file system all are closable.

-->h1 should n't be reinitialized
*/