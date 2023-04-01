class R
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
		catch (ArithmeticException ex)//Throwable
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}

/*

G:\nov20th\exception\app1\src>java -cp ../classes R
main begin
1
java.lang.ArithmeticException: / by zero
        at R.main(R.java:9)
main end
*/
