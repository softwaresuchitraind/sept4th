class A < X >
{
	X obj;
}
class M38
{
	
	public static void main(String[] args) 
	{
		A < ? extends P> a1 = null;
		a1 = new A<P>();
		a1.obj = new P();
		System.out.println("done");
	}
}

/*
cte

a1 is able to assign any subclass to P.
we can not assign any value to obj.


*/