class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}

/*
G:\nov20th\exception\app3\src>javac -d ../classes S.java
S.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test();
                    ^
1 error


caller of test() method should require try-catch or throws
*/
