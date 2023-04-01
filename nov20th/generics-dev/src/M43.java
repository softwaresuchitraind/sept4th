class A < T >
{
	T obj;
}
class M43 
{
	static void test(A<?> arg)
	{
		arg.obj = "abc";
	}
	public static void main(String[] args) 
	{
		
		test(new A<String>());
		//test(new A<Integer>());
		//test(new A<Double>());
		//test(new A<Float>());
		
		System.out.println("done");
	}
}

/*
cte


we can supply any datatype to test(),
how we can assign only String
*/