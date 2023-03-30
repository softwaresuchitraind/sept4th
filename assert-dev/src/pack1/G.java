package pack1;
class G
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert test();
		System.out.println(2);
	}

	static boolean test()
	{
		return true;
	}
}

/*

G:\sept4th\assert-dev\src>javac -d ../classes pack1/G.java

G:\sept4th\assert-dev\src>java -cp ../classes pack1.G
1
2

-test() return type is boolean
*/

