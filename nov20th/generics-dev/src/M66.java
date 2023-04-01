class A
{
	static<T> void test(T obj1, T obj2)
	{
	
	}
}
class M66
{
	public static void main(String[] args) 
	{

		A.<Integer>test(100,200);
		A.test(2000,"xyz");
		System.out.println("done");
	}
}

/*
done

2000,xyz can be upcasted to object
*/
