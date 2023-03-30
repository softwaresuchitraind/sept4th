interface A
{
	void test1();
	void test2();
}
abstract class B implements A //test2() available not implemented so declared as abstract
{
	public void test1()
	{
		System.out.println("from B.test1()");
	}
}
class M extends B
{

	public void test2()
	{
		System.out.println("from M.test2()");
	}
	public static void main(String[] args) 
	{
		M obj= new M();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}

/*
from B.test1()
from M.test2()
done
..................................
class- class ......extends
class-interface----implements
*/