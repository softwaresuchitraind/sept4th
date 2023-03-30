class K
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();//cte-----as no try and catch block
		System.out.println(2);
	}
	public static void test()throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
		
		
		
	}
}
/*
G:\sept4th\exceptions\app3\src>javac -d ../classes K.java
K.java:6: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                test();
                    ^
1 error

compiler not worrying about line no-12 becauce of throws ClassNotFoundException
u have to handle

if any calling statement it requires a try catch block.
*/