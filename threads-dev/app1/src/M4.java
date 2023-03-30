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
class M4
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		a1.test2();
/* */
		A a2= new A()//a2 poing to an objct subclass to A
		{
			
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
A.test1
AIC.test2
done
*the method u want to overide

*/