class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(1);
		int i = 10/0;
		System.out.println(2);
		try
		{
			System.out.println(3);
		}
	
		catch (ArithmeticException ex1)
			{
				System.out.println(4);
			}
			
		
		System.out.println("main end");
	}
}
/*
G:\nov20th\exception\app1\src>java -cp ../classes Z2
main begin
1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z2.main(Z2.java:7)


-If something is happening outside the try catch can not handle.
*/
