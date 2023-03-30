abstract class A
{
	abstract final void test1();
}
class M2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

M2.java:3: error: illegal combination of modifiers: abstract and final
        abstract final void test1();
                            ^
1 error

abstract means should be implemented in subclass.
if same is declare it should not be distrubed.

***it is a illigal combination,abstact method should not be declared as final and final method should not be abstract

*/
