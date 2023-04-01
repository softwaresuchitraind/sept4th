interface A	//Functional interface
{
	void test();
}
class  M2
{
	public static void main(String[] args) 
	{
		
		A a2 = () ->
			{
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
		    };
		a2.test();
	}
}

/*
Single method interface-Functional interface
No method -marker interface
*/