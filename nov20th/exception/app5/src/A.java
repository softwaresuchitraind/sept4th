class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (true)
		{
			System.out.println("from if");
			throw new ArithmeticException();
		}
		System.out.println(2);
	}
}
/*

G:\nov20th\exception\app5\src>javac -d ../classes A.java

G:\nov20th\exception\app5\src>java -cp ../classes A
1
from if
Exception in thread "main" java.lang.ArithmeticException
        at A.main(A.java:9)

-throw keyword is used for rising an exception object explicitely.
-if u r not handling flow will be terminated.
-U can terminate the flow using System.exit();
*/
