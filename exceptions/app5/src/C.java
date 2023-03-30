class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			System.out.println("from if");
			throw new OutOfMemoryError("something went wrong");
		}
		System.out.println(2);
	}
}
/*
u can ask to run time environment to rise either exception object/error object.

* Error object can rises

*/