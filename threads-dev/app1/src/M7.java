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
class M7
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		a1.test2();
/* */
		A a2= new A()//a2 poing to an object subclass to A
		{
			void test3()
			{
				System.out.println("AIC.test3");
			}
			
		
		};
		a2.test1();
		a2.test2();
		a2.test3();//compiler serching a2 in A
		System.out.println("done");
	}
}
/*
cte
new members of anonymos is not called from outside.
*/