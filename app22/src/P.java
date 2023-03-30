interface A
{
	void test1();
}
interface B
{
	void test2();
	
}
class P implements A,B
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		P p1=new P();
		p1.test1();
		p1.test2();
		System.out.println("done");
	}
}

/*
from test1
from test2
done

* implements A,B
A class can implement with any number of superclasses.
In java multiple inheristance is possible only through interfaces.
one class can not extend more than one superclass,
a class can implement any nuber of super interfaces.
in c++,multiple inheristance is possible through class also.
to avoid ambiguity class can not extends more than one classes.
*/
