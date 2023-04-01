class A < T >
{
	void method(T obj)
	{
	
	}
}
class M50
{
	static void test(A<? extends Number> arg)
	{
		arg.method(new Double(1.5);
	}
}

/*
cte--u can not use byte


G:\nov20th\generics-dev\src>javac -d ../classes M50.java
M50.java:12: error: ')' expected
                arg.method(new Double(1.5);
                                          ^
1 error


There is no boundary for the subclasses.

*/