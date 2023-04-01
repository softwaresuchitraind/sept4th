class A <T>
{
	T obj;
}
class M52 
{
	static void test(A<? super Number> arg)
	{
	
	}
	public static void main(String[] args) 
	{
		
		 test(new A<Number>());
		 test(new A<Object>());
		 test(new A<Integer>());
		 test(new A<String>());
		 System.out.println("done");
	}
}

/*
G:\nov20th\generics-dev\src>javac -d ../classes M52.java
M52.java:16: error: incompatible types: A<Integer> cannot be converted to A<? super Number>
                 test(new A<Integer>());
                      ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

*/