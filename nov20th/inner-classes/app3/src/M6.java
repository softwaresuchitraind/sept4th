class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		
			void test2()
			{
				System.out.println("AIC.test2()");
				test3();
			}
			void test3()
			{
				System.out.println("AIC.test3()");
			}
		};
		a1.test1();
		a1.test2();
		//a1.test3();
	}
}
/*
AIC.test1()
AIC.test2()
AIC.test3()

-now u can use test3(),can not be called outside,
u can not use A reference to call a3
- A new member in  the Anonymous inner class that 
should be used within the inner class
not outside.
*/

