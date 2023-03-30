class I 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
/*

G:\sept4th\exceptions\app3\src>javac -d ../classes I.java
I.java:12: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("");
                             ^
1 error

as class.forname--without a try catch/without a throws
*/
