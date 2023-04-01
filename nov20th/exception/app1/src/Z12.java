class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			System.exit(0);
			System.out.println(2);
		}
	
		catch (ArithmeticException ex)
		{
				System.out.println(3);
		}
		finally
		{
			System.out.println("from finally");
		}
			
		
		System.out.println("main end");//not getting
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes Z12
main begin
1


There is small deviatiom
-Whenever System.exit() ---it wont goes to finally.
it is coming away without looking for any thing
*/
