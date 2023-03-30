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
class M5
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test1();
		a1.test2();
/* */
		A a2= new A()//a2 poing to an object subclass to A
		{
			
			void test1()
			{
				System.out.println("AIC.test1");
			}
		
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
/*
we are overiding only test1()
test2() is inherited method.
G:\sept4th\threads-dev\app1\src>java -cp ../classes M5
A.test1
A.test2
AIC.test1
A.test2
done

*/