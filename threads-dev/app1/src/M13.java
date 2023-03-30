interface C
{
	void test1();
	void test2();
}
class  M13
{
	public static void main(String[] args) 
	{
		C c1=new C()//extending with object class and implimenting C
		{
			public void test1()
			{
				System.out.println("AIC.test1");
			}
			public void test2()
			{
				System.out.println("AIC.test2");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("Hello World!");
	}
}
/*
There is no way of creating an object to interface.
-no abstract method is allowed inside anonymos inner class.
-no anonymos class is allowed inside a interface.
*/
