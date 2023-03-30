class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int []x=new int[999999999];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex)//Throwable
		{
			ex.printStackTrace();//the message for an exception
		}
		System.out.println("main End");
	}
}
/*
main begin
1
java.lang.OutOfMemoryError: Java heap space
        at U.main(U.java:9)
main End

 we can handle error object

 whether error are handled or not ?
 yes
 error can be handled.
 error is a subclass to Throwaable.
*/