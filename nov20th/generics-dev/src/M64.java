class A
{
	static<T> void test(T obj1, T obj2)
	{
	
	}
}
class M64 
{
	public static void main(String[] args) 
	{

		A.test(100,200);
		A.test("abc","xyz");
		A.test("abc",5000);
		A.test(4.5,"test");
		System.out.println("done");
	}
}

/*
done

*/