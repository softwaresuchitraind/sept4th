interface  A
{
	void test();
	
}
class  B implements A
{
	public void test()
	{
		System.out.println("from B.test()");
	}
}
class  C implements A
{
	public void test()
	{
		System.out.println("from C.test()");
	}
}
class M5
{

	public static void main(String[] args) 
	{
		
		A a1=new B();//interfaces can be used for datatype purpose.
		A a2=new C();
		A[] elements={a1,a2};
		for(A element:elements)
		{
		element.test();
		}
		
	}
}

/*We never assign B type to C type or  Ctype to Btype
from B.test()
from C.test()

*/