//overide same signature
 class A
{
	 void test()
	{
		System.out.println("A.test()");
	}
}
class W extends A
{
	static void test()
	{
		System.out.println(" subclass A.test()");
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("done");
	}
}
/*
compile time error
Nonstatic can not be overide to static and viceversa is not also possible. 
*/