class M20 
{
	public static void main(String[] args) 
	{
		F.method1(new C()
		{
			void test2()
			{
				System.out.println("from test2");
			}
		});
		System.out.println("Hello World!");
	}
}
/*
from C.test1()
from test2
Hello World!

- We are designing a subclass to 
C--inside that we modify--implemet abstract method
*/