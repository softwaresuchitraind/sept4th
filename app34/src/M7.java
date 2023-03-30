final class A
{
}
class B extends A
{
}
class  M7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
M7.java:4: error: cannot inherit from final A
class B extends A
                ^
1 error

-class can also be declared as final.
-final class should not have any subclasses.
-we should not look for specialized class to final class.
*/