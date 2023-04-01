class M21
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	public static void main(String[] args) 
	{
		byte b1 =10;
		test1(b1);
		System.out.println("done");
	}
}
/*
byte primitives can be wider into long flot etc
byte primitives can not be converted into wider object.
There is no switable test1() method.
*/