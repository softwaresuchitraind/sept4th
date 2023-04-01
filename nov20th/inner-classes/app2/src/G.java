class G
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		
		B b1 = new G().new B();
		C c1 = new G.C();
		System.out.println("done");
	}
}

/*
done
C is a static inner class-- We can use outer class name --it is optional.

-using outer class name can be accessed---nonstatic innerclass-
can be accessed through outer class object name

*/