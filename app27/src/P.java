//overide same signature
class A 
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class P extends A
{
	void test()
	{
		System.out.println("from P.test()");
	}
	public static void main(String[] args) 
	{
		P p1=new P();
		p1.test();
		System.out.println("done");
	}
}
/*
from P.test()
done
*/
