class A < X >
{
	X obj;
}
class M31
{
	
	public static void main(String[] args) 
	{
		A <? super Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Object>();
		System.out.println("done");
	}
}


/*

done

only Number and Super class to Number.

*/