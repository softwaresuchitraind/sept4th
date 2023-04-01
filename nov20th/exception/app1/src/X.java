class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
			i = 10/0;
		}
		catch (ArithmeticException ex)
		{
			ex = null;
		}
		System.out.println("main end" + ex);
	}
}
/*
local members of catch can not be used in outside catch
*/