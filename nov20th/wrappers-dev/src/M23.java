class M23
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Byte obj)
	{
		System.out.println("test1(Byte)");
	}
	static void test1(Double d1)
	{
		System.out.println("test1(Double)");
	}
	public static void main(String[] args) 
	{
		byte b1 =10;
		test1(b1);//test1(new Byte(b1));
		System.out.println("done");
	}
}
/*
1st preference to widening.
if there is no switable method for widening then it goes to boxing
*/