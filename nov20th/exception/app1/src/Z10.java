class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
			
		}
	
		catch (ArithmeticException ex)
		{
				System.out.println(3);
				return;
			
		}
		finally
		{
			System.out.println("from finally");
		}
			
		
		System.out.println("main end");//not getting
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes Z10
main begin
1
3
from finally

-executes finally even return in catch
finally then return
*/