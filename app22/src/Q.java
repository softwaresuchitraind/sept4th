interface A
{
	void test1();
}
interface B
{
	void test2();
	
}
interface C extends A,B
{
	void test3();
	
}
class Q implements C
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.test1();
		q1.test2();
		q1.test3();
		System.out.println("done");
	}
}
/*
from test1
from test2
from test3
done


interface--interface >extends
class--interface >implements
class--class >extends

you can not develop a interface form a class because interface can not have concreteness.
*/