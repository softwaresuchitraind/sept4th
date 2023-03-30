interface A
{
	default void test()
	{
		System.out.println("from A ===> test");
	}
}
interface B
{
	default void test()
	{
		System.out.println("from B ===> test");
	}
}

class C implements A
{
	int i = 10;

}
class M4 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test();
	}
}

//abstrct class defined method can contain non static memebers
//but defaut method is not possible