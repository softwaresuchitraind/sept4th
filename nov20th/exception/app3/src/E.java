class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
	}
}
/*
try catch is not required .compiler not bothering about try catch as it is Unchecked.
cs
compiler does not know about unchecked.
*/