class  A
{
	void test1()
	{
		System.out.println("A.test1");
	}
	void test2()
	{
		System.out.println("A.test2");
	}
}
class M3
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		a1.test2();
/*statement is not ending with semicolon,we are developing a new class,
one anonimos inner class is designed.compiler autometically extends A.
a2 is is not pointing to objcet of A.it is pointing to sublclass to A
,both are overided test1() and test2()*/
		A a2= new A()
		{
			void test1()
			{
				System.out.println("AIC.test1");
			}
			void test2()
			{
				System.out.println("AIC.test2");
			}
		
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
/*
A.test1
A.test2
AIC.test1
AIC.test2
done

class A conating two concrete methods

*/