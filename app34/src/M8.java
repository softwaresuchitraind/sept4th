abstract final class A
{
}
class  M8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
M8.java:1: error: illegal combination of modifiers: abstract and final
abstract final class A
               ^
1 error

-same class should not be declared as abstract and final.
-abstract class should have subclass and final class should not have subclass.
-

---final is used for restricting/avoiding specialization
           -final variable can not be reinitialized.
		   -there is no way of overring in subclass if super class method is final.

-wherever superclass is required sypply subclass members.--subclass containg complete method of superclass.

*/