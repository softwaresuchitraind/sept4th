class A < X extends Number>
{
	X obj;
}
class M22
{
	public static void main(String[] args) 
	{
		A<P> a1 = new A<P>();
		A<Q> a2 = new A<Q>();
		System.out.println("done");
	}
}

/*
cte
-P and Q is not subclass to Number
*/