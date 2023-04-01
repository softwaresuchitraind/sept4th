class E
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		//non static members can be used in static members through reference variable
		B b1 = e1.new B();
		C c1 = new C();
		System.out.println("done");
	}
}

/*
done

By using reference variable we canuse non-static in a static context.



*/