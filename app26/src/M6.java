interface A
{
	default void test()
	{
		System.out.println("from A.test()");
	}
}
class B implements A
{

}
class M6
{
	public static void main(String[] args) 
	{
		B b1= new B();
		b1.test();
		System.out.println("done");
	}
}
/*
non static default implemented method can be accessed.
*/