class I
{
	class B
	{
	}
	static class C
	{
	}
}
class  J
{
	public static void main(String[] args) 
	{
		I.B b1 = new I().new B();
		I.C c1 = new I.C();
		System.out.println("done");
	}
}

/*

done 

inside J, B and C can not be used in the straight way
we have to use outer class to access inner


to create an object to B and C we require I class 
*/