class A < T >
{
	T obj;
}
class M42 
{
	static void test(A<?> arg)
	{
	
	}
	public static void main(String[] args) 
	{
		test(new A<Integer>());
		test(new A<String>());
		test(new A<Object>());
		System.out.println("done");
	}
}

/*
if it is a void type we can assign any type of reference
done

*/
