class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			
		}
	
		finally
		{
		System.out.println(3);
		}
		System.out.println("main end");
	}
}
/*
main begin
1
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z14.main(Z14.java:9)

* is there any possiblity of try without catch?yes,but
-if there is no catch with try finally is mandatory.

- exception handling is not there only executing

--try should be one catcch or multiple catch or finally.

-- we can not keep try alone,catch alone and finally alone.

--we have to start from try block---one/multiple catch----finally

Possible combinations:
------------------------
try-catch
try-catch-finally
try-catches
try-cathces-finally
try-finally
*/