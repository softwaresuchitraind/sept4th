class  A
{
	void test()
	{
		System.out.println("A.test");
	}
}
class M2
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.test();
/*this class has no name only we are specifying super class name---called anonymos class
it autometically extends.
for that class new operator as desired.
a2 pointing to subclass of A.
Inside that method test() got overrided.
*/
		A a2= new A()
		{
			void test()
			{
				System.out.println("AIC.test");
			}
		
		};
		a2.test();
		System.out.println("done");
	}
}
/*


*/