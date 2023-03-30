package pack1;
class I
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true : test();
		System.out.println(2);
	}

	static int test()
	{
		return 10;
	}
}
/*

G:\sept4th\assert-dev\src>javac -d ../classes pack1/I.java

G:\sept4th\assert-dev\src>java -cp ../classes -ea pack1.I
1
2

G:\sept4th\assert-dev\src>java -cp ../classes pack1.I
1
2
*/