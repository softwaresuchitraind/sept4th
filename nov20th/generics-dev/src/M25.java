class A < X >
{
	X obj;
}
class M25
{
	
	public static void main(String[] args) 
	{
		A <? extends Number> a1 = null;
		a1 = new A<Number>();
		a1 = new A<Integer>();
		a1 = new A<Byte>();
		System.out.println("done");
	}
}


/*
done

a1 can be either Number or any subclass to number.

wildcard extend Number


*/