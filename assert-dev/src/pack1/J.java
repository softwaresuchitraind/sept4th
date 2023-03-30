package pack1;
class J
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true : test();
		System.out.println(2);
	}

	static void test()
	{
	
	}
}
/*
G:\sept4th\assert-dev\src>javac -d ../classes pack1/J.java
pack1\J.java:7: error: 'void' type not allowed here
                assert true : test();
                                  ^
1 error


-After : we should not call a method whose return type is void

*/