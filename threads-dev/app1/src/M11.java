abstract class B
{
	abstract void test1();
	void test2()
	{
		System.out.println("from B.test2()");
	}
}
class  M11
{
	public static void main(String[] args) 
	{
		B b1=new B()
		{
			//implimenting abstract class
			void test1()
			{
				System.out.println("from AIC.test1()");
			}
			//overide
			void test2()
			{
				System.out.println("from AIC.test2()");
			}
		};
		b1.test1();
		b1.test2();
		System.out.println("Hello World!");
	}
}