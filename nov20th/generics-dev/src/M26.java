class A < X >
{
	X obj;
}
class M26
{
	
	public static void main(String[] args) 
	{
		A <? extends Number> a1 = null;
		a1 = new A<P>();
		a1 = new A<String>();
		a1 = new A<Object>();
		System.out.println("done");
	}
}


/*
cte

P , String and Object is not subclass to Number
*/