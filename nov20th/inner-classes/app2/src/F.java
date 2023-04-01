class F
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		
		B b1 = new F().new B();
		C c1 = new C();
		System.out.println("done");
	}
}


/*

done 

we can not create non static inner class in static members-
--u should require a reference
or Object

*/