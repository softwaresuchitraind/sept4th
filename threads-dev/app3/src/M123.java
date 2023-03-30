interface A
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from B.test");
	}
}
class M123
{
	public static void main(String[] args) 
	{
		A a1=new A()
		{
			public void test()
			{
				System.out.println("AIC test()");
			}
		};
		//if only one method in the interface use lamda exp
		A a2=()-> System.out.println("lamda.test()");
		B b1=new B();
		b1.test();
		a1.test();
		a2.test();
		System.out.println("done");
	}
}
/*
from B.test
AIC test()
lamda.test()
done

lamda exp--single method interfaces---functional interfaces
-compiler degining ananoymos inner class to lamda expression
*/