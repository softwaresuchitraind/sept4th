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
class M6
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		a1.test2();
/* */
		A a2= new A()//a2 poing to an object subclass to A
		{
			
			
		
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
/*
designing a subclass to A.
we do not overide any method.
*/