class M9 
{
	public static void main(String[] args) 
	{
		B b1 = new B(90)
		{
			{
				System.out.println("AIC-IIB");
			}
		
		};
		b1.test1();
		System.out.println("done");
	}
}
/*
B-IIB
B(int)
AIC-IIB
B-test1
done

- we specify super class constructor as a argument constructor.
-Inside anonymous class also there is one constructor.
-Inside anonymous inner class also compiler is developing one constuor.compiler is providing 
only super calling statement.

*/