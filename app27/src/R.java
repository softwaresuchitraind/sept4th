//overide same signature
abstract class A
{
	abstract void test();
	
}
class R extends A
{
	void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		R obj=new R();
		obj.test();
		System.out.println("done");
	}
}
/*
from subclass.test()
done
*/
