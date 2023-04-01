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
		P p1 =new P();
		p1.test();
		System.out.println("done");
	}
}
/*
method overriding
----------
signature should be same
G:\nov20th\app25\src>javac -d ../classes P.java

G:\nov20th\app25\src>java -cp ../classes P
from P.test()
done

---A class test() got overided.
*/
