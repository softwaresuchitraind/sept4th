//overide same signature
class A 
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class Q extends A
{
	void test(int i)
	{
		System.out.println("from subclass.test(int)");
	}
	public static void main(String[] args) 
	{
		Q obj=new Q();
		obj.test();
		System.out.println("done");
	}
}
/*
from A.test()
done
*/
