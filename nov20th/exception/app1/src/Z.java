class Z 
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
			int i = 10/0;
			System.out.println(4);
		}
		System.out.println("main end");
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes Z
main begin
1
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z.main(Z.java:15)


How to handle exception in catch body.
*/