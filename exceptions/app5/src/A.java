class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			System.out.println("from if");
			throw new ArithmeticException();
		}
		System.out.println(2);
	}
}
/*
G:\sept4th\exceptions\app5\src>java -cp ../classes A
1
from if
Exception in thread "main" java.lang.ArithmeticException
        at A.main(A.java:9)

rising an exception object explicitely.
*/