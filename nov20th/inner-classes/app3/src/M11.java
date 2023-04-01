class M11 
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			void test2()
			{
				System.out.println("from AIC.test2()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
/*
from C.test1()
from AIC.test2()
done

- We are not creating an object to C.We are creating an Anonymous inner class subclass to C
which is concreate.
*/