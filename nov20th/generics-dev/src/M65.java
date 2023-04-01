class A
{
	static<T> void test(T obj1, T obj2)
	{
	
	}
}
class M65
{
	public static void main(String[] args) 
	{

		A.<Integer>test(100,200);
		A.<Integer>test("abc","xyz");
		System.out.println("done");
	}
}

/*
G:\nov20th\generics-dev\src>javac -d ../classes M65.java
M65.java:14: error: incompatible types: String cannot be converted to Integer
                A.<Integer>test("abc","xyz");
                                ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

obj1 datatype is int how we can supply String

*/