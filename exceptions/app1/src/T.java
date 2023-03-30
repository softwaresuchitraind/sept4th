class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			String s1=null;
			int i=s1.length();
			System.out.println(2);
		}
		catch (NullPointerException ex)//Throwable
		{
			ex.printStackTrace();//the message for an exception
		}
		System.out.println("main End");
	}
}
/*
main begin
1
java.lang.NullPointerException
        at T.main(T.java:10)
main End
*/