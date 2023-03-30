class  A
{
	static
	{
		System.out.println("from A.SIB");
	}
	public static void test()
	{
		System.out.println("from A.test()");
	}
	
}
class  B extends A
{

		static
	{
		System.out.println("from B.SIB");
	}
}

class M7
{

	public static void main(String[] args) 
	{
		
	B.test();//compiler replaces A.test() as there is no test() to B
		
	}
}

/*

from A.SIB
from A.test()

*we can not achive polymorphism through static
*we can not declare static member as abstract

*/