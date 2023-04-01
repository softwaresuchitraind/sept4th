class M24
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Number obj)
	{
		System.out.println("test1(Number)");
	}

	public static void main(String[] args) 
	{
		byte b1 =10;
		test1(b1);//test1(new Byte(b1));
		System.out.println("done");
	}
}
/*

G:\nov20th\wrappers-dev\src>javac -d ../classes M24.java

G:\nov20th\wrappers-dev\src>java -cp ../classes M24
test1(Number)
done

* byte method autometically converted into number

*/