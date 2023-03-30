interface C
{
	void test1();
	void test2();
}
class  M14
{
	public static void main(String[] args) 
	{
		C c1=new C()//extending with object class and implimenting C
		{
			public void test1()
			{
				System.out.println("AIC.test1");
			}
		
			
		};
		c1.test1();
		c1.test2();
		System.out.println("Hello World!");
	}
}
/*
cte
test2() is not implimented.
*/