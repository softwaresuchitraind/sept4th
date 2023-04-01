class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
	
		finally
		{
			System.out.println(3);
		}
			
		
		System.out.println("main end");//not getting
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes Z14
main begin
1
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z14.main(Z14.java:9)


-We can develop try with finally---without catch


try-catch
try-catch-finally
try-catches
try-catches-finally
try-finally
*/