//overide same signature
abstract class A
{
	abstract void test();
	
}
class S extends A
{
	void test(int i)
	{
		System.out.println("from subclass.test(int i)");
	}
	public static void main(String[] args) 
	{
		S obj=new S();
		obj.test();
		System.out.println("done");
	}
}
/*
cte
while implimenting signature should same
*/
