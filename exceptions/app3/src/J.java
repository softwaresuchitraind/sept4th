class J 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(3);
		try
		{
			Class.forName("");	
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		
		System.out.println(4);
	}
}
/*


G:\sept4th\exceptions\app3\src>javac -d ../classes J.java

G:\sept4th\exceptions\app3\src>java -cp ../classes J
1
3
ex
4
2

because of try catch---cs,rs
*/