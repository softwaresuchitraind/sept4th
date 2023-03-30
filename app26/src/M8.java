interface A
{
	default void test()
	{
		System.out.println("from A.test()");
	}
}
interface B 
{
	default void test()
	{
		System.out.println("from B.test()");
	}

}
class C implements A,B
{

}
class M8
{
	public static void main(String[] args) 
	{
		C c1= new C();
		c1.test();
		System.out.println("done");
	}
}
/*
CTE
compiler will not allowing two inhering default method.
both interfaces containg a method with same signature.
*/