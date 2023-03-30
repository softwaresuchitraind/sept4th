class S 
{
	public static void main(String[] args)//does not have throws 
	{
		System.out.println("main begin");
		test();//does not have try catch
		System.out.println("main end");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}
/*

G:\sept4th\exceptions\app3\src>javac -d ../classes S.java
S.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test();
                    ^
1 error

the reason is while calling a test() it require a try catch or throws
*/