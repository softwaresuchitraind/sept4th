class C
{
	void test1()
	{
		System.out.println("c.test1()");
	}
}
class D extends C
  
{
	void test2()
	{
		System.out.println("D.test()");
	}
	public static void main(String[] args) 
	{
		D d1= new D();
		d1.test1();
		d1.test2();
		System.out.println("done");
	}
}
/*
c.test1()
d.test()
done

inheristance is used for achiving reusability
*/