class M16 
{
	public static void main(String[] args) 
	{
		D d1 = new D()
		{
			
			public void test2()
			{
				System.out.println("from test2");
			}
		};
		
		d1.test2();
		System.out.println("Hello ");
	}
}

/*
cte

-Anonymous inner class Should not have 
any abstract methods
-while designing itself we are applying new Operator.
*/