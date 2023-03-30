class B
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			System.out.println("from if");
			throw new ArithmeticException("something went wrong");
		}
		System.out.println(2);
	}
}
/*
G:\sept4th\exceptions\app5\src>java -cp ../classes B
1
from if
Exception in thread "main" java.lang.ArithmeticException: something went wrong
        at B.main(B.java:9)

*we can provide a message while flow is terminating.
throw keyword is used for rising exception explicitely.

*/