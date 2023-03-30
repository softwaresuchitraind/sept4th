class A
{
	A()throws ClassNotFoundException
	{
	
	}
}
class X extends A
{
	//super calling statement*no throws/try catch--cte
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
cte
no object is creating to A or X still getting compile time error.

we require a try catch or throw
*/