class D 
{
	void test1()
	{
		System.out.println("From test1");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		test1();
		System.out.println("test2 End");
	}
	
}
/*
G:\sept4th\app16\src>javac -d ../classes D.java
D.java:10: error: non-static method test1() cannot be referenced from a static context
                test1();
                ^
1 error
*/