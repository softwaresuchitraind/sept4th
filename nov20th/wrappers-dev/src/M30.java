class M30 
{
	public static void test(String x, double ...y)
	{
		System.out.println(x);
		for(double value : y)
		{
			System.out.println(value);
		}
		System.out.println("------");
	}
	public static void main(String[] args) 
	{
		test("abc");
		test("abc",4.5);
		test("abc",4.5,50.0);
		test("abc",4.5,50.0,2.3);
		System.out.println("done");
	}
}
/*
method can take any argument,
among all the argument var arg argument should 
be the last argument
*/