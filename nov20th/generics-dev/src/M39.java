class A < X >
{
	X obj;
}
class M39
{
	public static void main(String[] args) 
	{
		A<? super S> a1 = null;
		a1 = new A<S>();
		a1 = new A<R>();
		a1 = new A<Q>();
		a1 = new A<P>();
		a1 = new A<Object>();


		a1.obj = new S();
		a1.obj = new T();
		//a1.obj = new R();
		//a1.obj = new Q();
		//a1.obj = new P();
		//a1.obj = new Object();
		System.out.println("done");
	}
}

/*
u can assign S object or subclass to S

obj datatype can be Object class or any one among five
*/