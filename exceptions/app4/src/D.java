class D 
{
	public static void main(String[] args) 
	{
		try
		{
			//several statements
		}
		catch (ArithmeticException ex)
		{

		}
		catch (RuntimeException ex)
		{

		}
		catch (Exception ex)
		{

		}
		catch (Throwable ex)
		{

		}
		System.out.println("Hello World!");
	}
}
/*
cs

order should be followed.while giving multiple catches to the same try.we have to follow the order.
from most specialized class to most generalized class.
*/
