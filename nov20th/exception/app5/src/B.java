class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (true)
		{
			System.out.println("from if");
			throw new ArithmeticException("something went wrong");
		}
		System.out.println(2);
	}
}
/*
we will get amessage
-In every exception class there are two constructor without amessage an with a message
*/