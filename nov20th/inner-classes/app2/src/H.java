class H
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}

/*

-while using any inner class for the datatype purpose always 
keep using outer.inner-no matter
inner is non static or static

done

*/