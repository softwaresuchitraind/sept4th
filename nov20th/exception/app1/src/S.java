class S 
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
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
flow is terminating in the middle there is no compartible catch



G:\nov20th\exception\app1\src>java -cp ../classes S
main begin
1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at S.main(S.java:9)

*/
