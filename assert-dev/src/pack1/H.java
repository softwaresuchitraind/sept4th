package pack1;
class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert test();
		System.out.println(2);
	}

	static int test()
	{
		return 10;
	}
}
/*
G:\sept4th\assert-dev\src>javac -d ../classes pack1/H.java
pack1\H.java:7: error: incompatible types: int cannot be converted to boolean
                assert test();
                           ^
1 error
*/