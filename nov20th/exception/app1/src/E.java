class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj =new Object();
		E e1 =(E) obj;//downcast
		System.out.println("Main end");
	}
}

/*
ClassCastException
object class object can not be casted into E.
*/
