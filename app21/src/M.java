abstract class A
{
	void test1()
	{
		System.out.println("from A.test1()");
	}
	abstract void test2();
	abstract void test3();

}
abstract class B extends A// B should be declared as abstact as it contains one inheriterd abstract class
{
	void test2()
	{
		System.out.println("from B.test2()");
	}
	 
}

class M extends B//M class does not conatin abstact method
{
	 void test3()
	{
		System.out.println("from M.test3()");
	 }
	public static void main(String[] args) 
	{
		M obj= new M();
		obj.test1();
		System.out.println(".................");
		obj.test2();
		System.out.println(".................");
		obj.test3();
	}
}


/*

*/