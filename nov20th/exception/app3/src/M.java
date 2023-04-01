class M
{
	public static void main(String[] args) 
		throws ClassNotFoundException
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}

/*
G:\nov20th\exception\app3\src>java -cp ../classes M
1
3
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Class.java:264)
        at M.test(M.java:13)
        at M.main(M.java:7)
*/