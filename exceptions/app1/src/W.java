class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i=0;
			i=10/0;
		}
		catch (ArithmeticException ex)//Throwable
		{
			i=20;//the message for an exception
		}
		System.out.println("main End" +i);
	}
}
/*

2 cte
local members of try can not be used in outside the try.
i is local to try, i can not be used in catch and last statement.
*/