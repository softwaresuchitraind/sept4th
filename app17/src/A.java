 class A 
{
	public static void main(String[] args) 
	{
		A a1= new A();
		A a2=a1;
		A a3=a1;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}

/*
o/p-
A@1db9742
A@1db9742
A@1db9742
object address is printing 
a1,a2,a3 all are pointing to the same object.
*/
