class A < X >
{
	void test(X arg)
	{
	
	}
}
class M36
{
	
	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<P>();
		a1.test(new P());

		A<Integer> a2 = null;
		a2 = new A<Integer>();
		a2.test(90);
		System.out.println("done");
	}
}


/*

cte

we can anot assign Ptype

we can not call test() in P

arg datatype is 100% dynamic, we can not call test()
*/