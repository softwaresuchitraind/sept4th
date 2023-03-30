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
class M8
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
			void test1()
			{
				System.out.println("AIC.test1");
				test3();
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
AIC.test3
A.test2
done

test3() is anewly developed method that can be called in the same class.
compiler checks what is A1.runtime environment checks to where a1 pointing.
*/