class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			String s1 =null;
			int i = s1.length();
			System.out.println(2);
		}
		catch (NullPointerException ex)//THrowable
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes T
main begin
1
java.lang.NullPointerException
        at T.main(T.java:10)
main end
*/