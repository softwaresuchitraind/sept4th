'class W 
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
			i =20;
		}
		System.out.println("main end" +i);
	}
}
/*
cte
local variables of try can not be used outside 
*/