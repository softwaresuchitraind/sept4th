class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i=10;
			i=10/0;
		}
		catch (ArithmeticException ex)//Throwable
		{
			ex=null;
		}
		System.out.println("main End" +ex);
	}
}
/*
cte
local members of catch can not be used in outside a catch.
ex is local to catch it should not be used outside the catch
*/