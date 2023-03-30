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

class C implements A,B
{
	public void test()
	{
		System.out.println("From C=> test");
	}

}
class M3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//inside interface u can not provide any non static attributes
//but in abstract class it is possible

//no constructor in interface but in abstrct class it is.

