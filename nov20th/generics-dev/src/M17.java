class A < X extends R>
{
	X obj;
}
class M17 
{
	public static void main(String[] args) 
	{
		A<R> a1 = new A<R>();
		A<S> a2 = new A<S>();
		A<T> a3 = new A<T>();
		System.out.println("done");
	}
}

/*
Any subclasses of R can be supplied

X is not 100% Generic.It should be either R or subclass to R.

*/