interface A
{
	default void test()
	{
		System.out.println("from A.test()");
	}
}
interface B extends A
{

}
class C implements B
{

}
class M7
{
	public static void main(String[] args) 
	{
		C c1= new C();
		c1.test();
		System.out.println("done");
	}
}
/*
from A.test()
done

non static default implemenation of interface can be accessed through inheristance.
*/