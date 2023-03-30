interface A
{
	void test1();
	void test2();
	void test3();
}
abstract class B implements A //B implements A
{
	public void test1()
	{
		System.out.println("from B.test1()");
	}
}
abstract class C extends B //C extends B
{
	public void test2()
	{
		System.out.println("from c.test2()");
	}
}
class N extends C
{

	public void test3()
	{
		System.out.println("from n.test3()");
	}
	public static void main(String[] args) 
	{
		N obj= new N();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}

/*

from B.test1()
from C.test2()
from N.test3()
done

*/