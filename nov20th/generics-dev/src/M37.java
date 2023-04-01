class A < X >
{
	void test(X arg)
	{
	
	}
}
class M37
{
	
	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = null;
		a1 = new A<Integer>();
		a1.test(10);
		System.out.println("done");
	}
}


/*

cte

u can not compare Integer object to Number we have to upcast it.

there is chance of poing byte short, int etc.

how we can supply only 10. it is not possible
 compiler checking what is a1 not where a1 pointing.

 there is no boundary to count a particular class

 if wild card extends it can not be argument to methods

*/